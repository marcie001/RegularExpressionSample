import java.util.regex.*;
public class RegularExpression8 {
    public static void main(String[] args) {
        String p = "(?=[\\s\\S]*jkl)(?=[\\s\\S]*abc)";
        String m0 = "abcde\nfghijkl\nmnopqr\nstuv\nwxyz";
        String m1 = "abcde\nmnopqr\nstuv\nwxyz";
        Pattern pt = Pattern.compile(p, Pattern.MULTILINE);
        System.out.println(pt.matcher(m0).lookingAt());
        System.out.println(pt.matcher(m1).lookingAt());
    }
}
