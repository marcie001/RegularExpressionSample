import java.util.regex.*;
public class RegularExpression7 {
    public static void main(String[] args) {
        String p0 = "^(?:中古)?カメラ販売";
        String m0 = "カメラ販売";
        Pattern pt0 = Pattern.compile(p0, Pattern.MULTILINE);
        Matcher mt0 = pt0.matcher(m0);
        while (mt0.find()) {
            System.out.println(mt0.groupCount());
        }

        String p1 = "^(中古)?カメラ販売";
        Pattern pt1 = Pattern.compile(p1, Pattern.MULTILINE);
        Matcher mt1 = pt1.matcher(m0);
        while (mt1.find()) {
            System.out.println(mt1.groupCount());
        }
    }
}
