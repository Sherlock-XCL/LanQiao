import java.util.Scanner;

public class id312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double ans = 1;
        for (int i = 1; i <= 9999; i ++) {
            if (ans == n) {
                System.out.println("YES");
                sc.close();
                return;
            }
            ans = Math.pow(2, i);
            if (ans > 1e8 + 5) {
                break;
            }
        }
        System.out.println("NO");
        sc.close();
    }
}
