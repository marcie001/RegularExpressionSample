import java.util.regex.*;
public class RegularExpression6 {
    public static void main(String[] args) {
        String p = "(?=.*hij)(?=.*abc)";
        String m0 = "abcdefghijklmnop";
        String m1 = "hijklmnopqrstuvwxyz";
        Pattern pt = Pattern.compile(p, Pattern.MULTILINE);
        Matcher mt0 = pt.matcher(m0);
        while (mt0.find()) {
            System.out.println("find pattern in " + m0);
        }
        Matcher mt1 = pt.matcher(m1);
        while (mt1.find()) {
            System.out.println("find pattern in " + m1);
        }

        System.out.println("----------");
    }
}
