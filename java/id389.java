import java.util.Scanner;

// 数字反转
// -380 -> -83
public class id389 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        boolean flag = false;
        if (str.charAt(0) == '-') {
            flag = true;
            str = str.substring(1);
        }
        String reversed = new StringBuilder(str).reverse().toString();
        int ans = Integer.valueOf(reversed);
        if (flag) {
            System.out.println(-ans);
        } else {
            System.out.println(ans);
        }
        sc.close();
    }
}
