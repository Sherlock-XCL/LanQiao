import java.util.HashMap;
import java.util.Scanner;

// 用杂志拼接信件
public class id323 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c1 : s1.toCharArray()) {
            if (map.get(c1) == null) {
                map.put(c1, 1);
            } else {
                map.put(c1, map.get(c1) + 1);
            }
        }
        boolean success = true;
        for (char c2 : s2.toCharArray()) {
            if (map.get(c2) == null || map.get(c2).equals(0)) {
                success = false;
                break;
            } else {
                map.put(c2, map.get(c2) - 1);
            }
        }
        if (success) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}
