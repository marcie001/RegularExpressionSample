import java.util.regex.*;
public class RegularExpression4 {
    public static void main(String[] args) {
        String p = "^\\s*お問合せ内容\\s*:([\\s\\S]+)^\\s*弊社では";
        String m = "希望:やすいところ\n  お問合せ内容:ああああ\nいいい\n    弊社では";
        Pattern pt = Pattern.compile(p, Pattern.MULTILINE);
        Matcher mt = pt.matcher(m);
        while (mt.find()) {
            System.out.println("\"" + mt.group(1) + "\"");
        }

        System.out.println("----------");

        String p1 = "^お名前：\\S+\\s+(\\S+)";
        String m1 = "お名前：鈴木 太郎\n備考:ああああ\nいいい\n\n※備考は複数行";
        Pattern pt1 = Pattern.compile(p1, Pattern.MULTILINE);
        Matcher mt1 = pt1.matcher(m1);
        while (mt1.find()) {
            System.out.println("\"" + mt1.group(1) + "\"");
        }

        System.out.println("----------");

        String p2 = "^\\s*名前\\s*:(.+)";
        String m2 = "  名前     :鈴木 太郎\n備考:ああああ\nいいい\n\n※備考は複数行";
        Pattern pt2 = Pattern.compile(p2, Pattern.MULTILINE);
        Matcher mt2 = pt2.matcher(m2);
        while (mt2.find()) {
            System.out.println("\"" + mt2.group(1) + "\"");
        }
    }
}
