import java.util.regex.*;
public class RegularExpression {
    public static void main(String[] args) {
        String s = "お問合せ番号：123456\n商品番号：foo, bar, hoge\n内容：大量在庫ありますか？\n無い場合どれくらいで準備できますか？";
        String p = "(?:^商品番号：|\\G, )(\\w+)";
        Pattern pt = Pattern.compile(p, Pattern.MULTILINE);
        Matcher mt = pt.matcher(s);
        while (mt.find()) {
            System.out.println(mt.group(1));
        }

        System.out.println("--------");

        String s1 = "    郵便番号    :100-0001です";
        String p1 = "(?:\\s*郵便番号\\s*:|\\G-)(\\d+)";
        Pattern pt1 = Pattern.compile(p1);
        Matcher mt1 = pt1.matcher(s1);
        while (mt1.find()) {
            System.out.println(mt1.group(1));
            System.out.println(mt1.group());
        }

        System.out.println("--------");

        String s2 = "    郵便番号    :   100      -   0001 です";
        String p2 = "(?:\\s*郵便番号\\s*:\\s*|\\G\\s*-\\s*)(\\d+)";
        Pattern pt2 = Pattern.compile(p2);
        Matcher mt2 = pt2.matcher(s2);
        while (mt2.find()) {
            System.out.println(mt2.group(1));
            System.out.println(mt2.group());
        }
    }
}
