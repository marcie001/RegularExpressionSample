import java.util.regex.*;
public class RegularExpression5 {
    public static void main(String[] args) {
        String p = "(@example.com$|@example.jp$)";
        String m0 = "foo@example.com";
        String m1 = "bar@example.jp";
        Pattern pt = Pattern.compile(p, Pattern.MULTILINE);
        Matcher mt0 = pt.matcher(m0);
        while (mt0.find()) {
            System.out.println("\"" + mt0.group(1) + "\"");
        }
        Matcher mt1 = pt.matcher(m1);
        while (mt1.find()) {
            System.out.println("\"" + mt1.group(1) + "\"");
        }

        System.out.println("----------");
    }
}
