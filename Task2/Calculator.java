import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class Calculator {
    private static final Map<String, Operation> operators;

    static {
        Map<String, Operation> map = new HashMap<>();
        map.put("+", Operation.Plus);
        map.put("-", Operation.Minus);
        map.put("*", Operation.Times);
        map.put("/", Operation.Divide);
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
        Function<Double, Function<Double, Double>> fun =
                switch (operators.get(sexp.operation())) {
                    case Plus -> x -> y -> x + y;
                    case Minus -> x -> y -> x - y;
                    case Times -> x -> y -> x * y;
                    case Divide -> x -> y -> x / y;
                };
        while (iterator.hasNext()) {
            var arg = iterator.next();
            accum = fun.apply(accum).apply(switch (arg) {
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

    private enum Operation {Plus, Minus, Times, Divide}
}
