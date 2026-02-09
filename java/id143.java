import java.util.*;

public class id143 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int origin = n;
        int ans = 0;
        while (true) {
            if (n >= 3) {
                n -= 2;
                ans ++;
            } else {
                System.out.println(origin + ans);
                break;
            }
        }
        sc.close();
    }
}
