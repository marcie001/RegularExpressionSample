import java.util.regex.*;
public class RegularExpression11 {
    public static void main(String[] args) {
        String p = "連絡先(?:\\(FAX\\))?：(.*)";
        String s = "お問合せ番号：123456";
        s += "\n商品番号：foo, bar, hoge";
        s += "\n内容：大量在庫ありますか？\n無い場合どれくらいで準備できますか？";
        s += "\n連絡先(TEL)：03-0000-0000";
        s += "\n連絡先(FAX)：03-0000-0001";
        s += "\nその他連絡事項：昼間は連絡つきません。\n夜に連絡してください。";
        Pattern pt = Pattern.compile(p);
        Matcher mt = pt.matcher(s);
        while (mt.find()) {
            System.out.println(mt.group(1));
        }


        String s1 = "お問合せ番号：123456";
        s1 += "\n商品番号：foo, bar, hoge";
        s1 += "\n内容：大量在庫ありますか？\n無い場合どれくらいで準備できますか？";
        s1 += "\n連絡先(TEL)：03-0000-0002";
        s1 += "\n連絡先：03-0000-0003";
        s1 += "\nその他連絡事項：昼間は連絡つきません。\n夜に連絡してください。";
        Pattern pt1 = Pattern.compile(p);
        Matcher mt1 = pt1.matcher(s1);
        while (mt1.find()) {
            System.out.println(mt1.group(1));
        }


        String p2 = "^\\[FOO BAR\\] テスト.*$";
        String s2 = "[FOO BAR] テストdaedfkla;euao";
        Pattern pt2 = Pattern.compile(p2);
        Matcher mt2 = pt2.matcher(s2);
        System.out.println(mt2.matches());
    }
}
