import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Queue;
import java.util.LinkedList;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class Aufgabe1 {
    private static final Pattern REGEX = Pattern.compile("%([1-9]\\$)?([-#+0,( ])*([1-9][0-9]*)?(\\.[1-9][0-9]*)?[bBhHsScCdoxXeEfgGaAtT%n]+");
    private record Format(int begin, int end) {
	public String toString() {
	    return String.format("%d,%d", begin, end);
	}
    }
    public static void main(String[] args) {
	try (Stream<String> stream = Files.lines(Paths.get("RegexText.txt"))) {
	    stream.forEach(line -> {
		    var matcher = REGEX.matcher(line);
		    var accum = new LinkedList<Format>();
		    while(matcher.find()) {
			accum.add(new Format(matcher.start(), matcher.end()));
		    }
		    print(accum, line);
		});
	} catch (Exception e) {
	    System.out.println(e.toString());
	}
    }

    public static void print(Queue<Format> lst, String text) {
	var strBuilder = new StringBuilder();
	var index = 0;
	while(index < text.length()) {
	    var format = lst.poll();
	    if (format == null) {
		strBuilder.append(String.format("TEXT(%s)", text.substring(index, text.length())));
		break;
	    }
	    if (format.begin != 0) {
		strBuilder.append(String.format("TEXT(%s)", text.substring(index, format.begin)));
	    }
	    strBuilder.append(String.format("FORMAT(%s)", text.substring(format.begin, format.end)));
	    index = format.end;
	}
	System.out.println(strBuilder);
    }
}
