package Task6;
import org.stringtemplate.v4.STGroupFile;
import org.stringtemplate.v4.ST;

public class ClassTable {
    public static void main(String[] args) throws ClassNotFoundException {
        var objs = new Class[] {
                Class.forName("java.lang.String"),
                Class.forName("java.util.Iterator"),
                Class.forName("java.time.Month")
        };

        var template = new STGroupFile("Task6/task6.stg").getInstanceOf("class_table");
        template.add("n", objs);
        System.out.println(template.render());
    }
}
