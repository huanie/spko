import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public final class Functional {
    private static final int MIN_LENGTH = 20;

    private Functional() {
    }

    public static void main(String[] args) throws IOException {
        var input = Paths.get("report/main.typ");

        long start = System.nanoTime();

        var n = Files.newBufferedReader(input).lines().filter(l -> !l.isBlank() && MIN_LENGTH <= l.length()).mapToInt(l -> l.length()).sum();

        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }
}

