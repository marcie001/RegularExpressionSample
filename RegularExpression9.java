import java.util.regex.*;
public class RegularExpression9 {
    public static void main(String[] args) {
        String p = "(?=[\\s\\S]*foo)(?=[\\s\\S]*希望条件：事務|[\\s\\S]*希望条件：販売)";
        String m0 = "テスト\nfoo\n希望条件：販売\nテスト";
        String m1 = "テスト\nfoo\n希望条件：事務\nテスト";
        String m2 = "テスト\nfoo\n希望条件：店長\nテスト";
        Pattern pt = Pattern.compile(p, Pattern.MULTILINE);
        System.out.println(pt.matcher(m0).lookingAt());
        System.out.println(pt.matcher(m1).lookingAt());
        System.out.println(pt.matcher(m2).lookingAt());
    }
}
