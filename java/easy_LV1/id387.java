import java.util.Scanner;

// 质因数分解
public class id387 {
    public static boolean judge(int x) {
        if (x == 2) return true;
        for (int i = 2; i <= x / 2; i ++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = n / 2;
        // ans = n / i， 21 / 3 = 7
        for (int i = 2; i <= k; i++) {
            if (n % i == 0 && judge(i)) {
                System.out.println(n / i);
                break;
            }
        }
        sc.close();
    }
}
