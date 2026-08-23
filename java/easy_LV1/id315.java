import java.util.Arrays;
import java.util.Scanner;

// 三个数的最大乘积
// -5 6 -7 2 3 5 -8
public class id315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i ++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int max = Math.max(a[0] * a[1] * a[n - 1], a[n - 1] * a[n - 2] * a[n - 3]);
        System.out.println(max);
        sc.close();
    }
}
