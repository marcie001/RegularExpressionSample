import java.util.regex.*;
public class RegularExpression10 {
    public static void main(String[] args) {
        String s = "お問合せ番号：123456";
        s += "\n商品番号：foo, bar, hoge";
        s += "\n内容：大量在庫ありますか？\n無い場合どれくらいで準備できますか？";
        s += "\n連絡先：03-0000-0000";
        s += "\nその他連絡事項：昼間は連絡つきません。\n夜に連絡してください。";
        String p = "内容：([\\s\\S]*?)連絡先：[\\s\\S]*その他連絡事項：([\\s\\S]*)";
        Pattern pt = Pattern.compile(p, Pattern.MULTILINE);
        Matcher mt = pt.matcher(s);
        while (mt.find()) {
            System.out.println(mt.group(1));
            System.out.println(mt.group(2));
        }
    }
}
