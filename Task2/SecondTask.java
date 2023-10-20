import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;
import java.nio.file.Path;

class SecondTask {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            throw new RuntimeException("Need a file argument");
        }
        process(args[0]);
    }

    public static void process(String path) throws IOException {
        var parser = new SExpressionParser(new CommonTokenStream(
                new SExpressionLexer(CharStreams.fromPath(Path.of(path)))));
        var tree = Node.parse(parser.sexpression());
        System.out.println(tree);
        System.out.println(Calculator.calculate(tree));
    }
}