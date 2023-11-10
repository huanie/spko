package Task2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Calculator {
    private static final Map<String, BiFunction<Double, Double, Double>>
            operators;

    static {
        Map<String, BiFunction<Double, Double, Double>> map =
                new HashMap<>();
        map.put("+", (x, y) -> x + y);
        map.put("-", (x, y) -> x - y);
        map.put("*", (x, y) -> x * y);
        map.put("/", (x, y) -> x / y);
        operators = Collections.unmodifiableMap(map);
    }

    private static double reduceSexp(Node.SExpression sexp) {
        var iterator = sexp.arguments().iterator();
        double accum = switch (iterator.next()) {
            case Node.SExpression x -> reduceSexp(x);
            case Node.Literal x -> Double.parseDouble(x.literal());
            default -> throw new IllegalStateException(
                    "Unexpected value: " + sexp.arguments().iterator().next());
        };
        var fun = operators.get(sexp.operation());
        while (iterator.hasNext()) {
            var arg = iterator.next();
            accum = fun.apply(accum, switch (arg) {
                case Node.Literal x -> Double.parseDouble(x.literal());
                case Node.SExpression reduce -> reduceSexp(reduce);
                default -> throw new IllegalStateException(
                        "Unexpected value: " + arg);
            });
        }
        return accum;
    }


    public static double calculate(Node expression) {
        return switch (expression) {
            case Node.Literal x -> Double.parseDouble(x.literal());
            case Node.SExpression sexp -> reduceSexp(sexp);
            default -> throw new IllegalStateException(
                    "Unexpected value: " + expression);
        };
    }
}
