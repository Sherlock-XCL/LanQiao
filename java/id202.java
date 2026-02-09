import java.util.*;

public class id202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Set<Character> charSet = new HashSet<>();
        boolean flag = true;
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
