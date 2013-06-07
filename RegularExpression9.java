import java.util.regex.*;
public class RegularExpression9 {
    public static void main(String[] args) {
        String p0 = "(?=[\\s\\S]*foo)(?=[\\s\\S]*希望条件：事務|[\\s\\S]*希望条件：販売)";
        String m0 = "テスト\nfoo\n希望条件：販売\nテスト";
        String m1 = "テスト\nfoo\n希望条件：事務\nテスト";
        String m2 = "テスト\nfoo\n希望条件：店長\nテスト";
        Pattern pt0 = Pattern.compile(p0, Pattern.MULTILINE);
        System.out.println(pt0.matcher(m0).lookingAt());
        System.out.println(pt0.matcher(m1).lookingAt());
        System.out.println(pt0.matcher(m2).lookingAt());

        System.out.println("----------------");

        String p1 = "(?![\\s\\S]*foo)(?=[\\s\\S]*希望条件：事務|[\\s\\S]*希望条件：販売)";
        String m3 = "テスト\nfoo\n希望条件：販売\nテスト";
        String m4 = "テスト\nfoo\n希望条件：事務\nテスト";
        String m5 = "テスト\nfoo\n希望条件：店長\nテスト";
        String m6 = "テスト\nbar\n希望条件：販売\nテスト";
        String m7 = "テスト\nbar\n希望条件：事務\nテスト";
        String m8 = "テスト\nbar\n希望条件：店長\nテスト";
        Pattern pt1 = Pattern.compile(p1, Pattern.MULTILINE);
        System.out.println(pt1.matcher(m3).lookingAt());
        System.out.println(pt1.matcher(m4).lookingAt());
        System.out.println(pt1.matcher(m5).lookingAt());
        System.out.println(pt1.matcher(m6).lookingAt());
        System.out.println(pt1.matcher(m7).lookingAt());
        System.out.println(pt1.matcher(m8).lookingAt());
    }
}
