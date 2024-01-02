import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

import java.io.BufferedReader;
import java.util.LinkedList;

public final class Procedural {
    private Procedural() {
    }

    private static final int MIN_LENGTH = 20;

    public static void main(String[] args) throws IOException {
        var input = Paths.get("report/main.typ");
        var lines = new LinkedList<String>();

        long start = System.nanoTime();
        readLines(Files.newBufferedReader(input), lines);
        removeEmptyLines(lines);
        removeShortLines(lines);
        int n = totalLineLengths(lines);

        long stop = System.nanoTime();

        System.out.printf("result = %d (%d microsec)%n", n, (stop - start) / 1000);
    }

    // TODO: Klassenmethoden readLines, removeEmptyLines, removeShortLines,
    // totalLineLengths
    private static void readLines(BufferedReader buffer, LinkedList<String> lines) {
        try {
            String line;
            while ((line = buffer.readLine()) != null) {
                lines.add(line);
            }
        } catch (Exception e) {
            System.out.println("Hi");
        }
    }

    private static void removeEmptyLines(LinkedList<String> lines) {
        var collect = new LinkedList<String>();
        for (var i = 0; i < lines.size(); i++) {
            var line = lines.get(i);
            if (!line.isBlank()) {
                collect.add(line);
            }
        }
        lines.clear();
        lines.addAll(collect);
    }

    private static void removeShortLines(LinkedList<String> lines) {
        var collect = new LinkedList<String>();
        for (var i = 0; i < lines.size(); i++) {
            var line = lines.get(i);
            if (MIN_LENGTH <= line.length()) {
                collect.add(line);
            }
        }
        lines.clear();
        lines.addAll(collect);
    }

    private static int totalLineLengths(LinkedList<String> lines) {
        var count = 0;
        for (var i = 0; i < lines.size(); i++) {
            count += lines.get(i).length();
        }
        return count;
    }
}
