import java.util.ArrayList;
import java.util.List;

public interface Node {
    static SExpression parse(
            SExpressionParser.SexpressionContext sexpression) {
        var arguments = sexpression.rest();
        var head = sexpression.head().getText();

        return new SExpression(head, recurse(arguments));
    }

    private static Iterable<Node> recurse(
            List<SExpressionParser.RestContext> arguments) {
        var argumentAccum = new ArrayList<Node>(arguments.size());
        for (var arg : arguments) {
            var literal = arg.SYMBOL();
            var reduce = arg.sexpression();
            if (literal != null) {
                argumentAccum.add(new Literal(literal.getText()));
            } else if (reduce != null) {
                argumentAccum.add(new SExpression(reduce.head().getText(),
                        reduce.rest()));
            } else {
                throw new RuntimeException(
                        String.format("What is this: %s ?%n", arg.getText()));
            }
        }
        return argumentAccum;
    }

    record SExpression(String operation, Iterable<Node> arguments)
            implements Node {

        private SExpression(String text,
                            List<SExpressionParser.RestContext> rest) {
            this(text, Node.recurse(rest));
        }
    }

    record Literal(String literal) implements Node {
        @Override
        public String toString() {
            return literal;
        }
    }
}