package Task3;

import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public interface Node {
    ArrayList<String> errors = new ArrayList<>();

    static SExpression parse(
            SExpressionParser.SexpressionContext sexpression) {
        var arguments = sexpression.arg();
        var head = sexpression.head().getText();

        var result = new SExpression(head, traverse(arguments));
        if (!errors.isEmpty()) {
            errors.stream().forEach(System.err::println);
            System.exit(1);
        }
        return result;
    }

    private static Iterable<Node> traverse(
            List<SExpressionParser.ArgContext> arguments) {
        var argumentAccum = new ArrayList<Node>(arguments.size());
        for (var arg : arguments) {
            var literal =
                    Arrays.asList(arg.Integer(), arg.Float(),
                                    arg.Long(), arg.Double()).stream()
                            .filter(x -> x != null).findAny().orElse(null);
            var reduce = arg.sexpression();
            if (literal != null) {
                argumentAccum.add(new Literal(literal));
            } else if (reduce != null) {
                argumentAccum.add(new SExpression(reduce.head().getText(),
                        reduce.arg()));
            } else {
                throw new RuntimeException(
                        String.format("AST: What is this: %s ?%n",
                                arg.getText()));
            }
        }
        return argumentAccum;
    }

    record SExpression(String operation, Iterable<Node> arguments)
            implements Node {
        private SExpression(String text,
                            List<SExpressionParser.ArgContext> arg) {
            this(text, Node.traverse(arg));
        }
    }

    class Literal implements Node {
        public final Number literal;

public Literal(TerminalNode terminal) {
    Function<String,
            Map.Entry<NumberType, Function<String, Number>>> fun =
            x -> switch (terminal.getSymbol().getType()) {
                case SExpressionLexer.Integer ->
                        Map.entry(NumberType.Integer,
                                o -> Integer.parseInt(o));
                case SExpressionLexer.Double ->
                        Map.entry(NumberType.Double,
                                o -> Double.parseDouble(o));
                case SExpressionLexer.Long ->
                        Map.entry(NumberType.Long,
                                o -> Long.parseLong(o));
                case SExpressionLexer.Float ->
                        Map.entry(NumberType.Float,
                                o -> Float.parseFloat(o));
                default -> throw new RuntimeException(
                        "What is this: " + x);
            };
    this.literal = parseValue(terminal, fun);
}

private Number parseValue(TerminalNode string,
                          Function<String, Map.Entry<NumberType, Function<String, Number>>> parseFun) {
    var noSuffix = removeSuffix(string.getText());
    var f = parseFun.apply(noSuffix);
    try {
        var number = f.getValue().apply(noSuffix);
        if (List.of(new Number[]{Double.POSITIVE_INFINITY,
                Double.NEGATIVE_INFINITY, Double.NaN,
                Float.POSITIVE_INFINITY,
                Float.NEGATIVE_INFINITY,
                Float.NaN}).contains(number)) {
            throw new NumberFormatException();
        } else {
            return number;
        }
    } catch (NumberFormatException e) {
        Node.errors.add(String.format("%s is not a %s: %s:%s",
                string.getText(),
                f.getKey(),
                string.getSymbol().getLine(),
                string.getSymbol().getCharPositionInLine()));
        return Float.NaN;
    }
}

        private String removeSuffix(String text) {
            if (Character.isAlphabetic(text.charAt(text.length() - 1))) {
                System.out.println(text.substring(0, text.length() - 1));
                return text.substring(0, text.length() - 1);
            } else {
                return text;
            }
        }

        @Override
        public String toString() {
            return literal.toString();
        }

        private enum NumberType {Float, Long, Double, Integer}
    }
}