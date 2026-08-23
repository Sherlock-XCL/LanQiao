package B_16;

import java.util.Scanner;

public class Solution7 {
    // 2的幂
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int ans = -1;
        for (int i = 0; i < n; i ++) {
            a[i] = sc.nextInt();
        }
        double p = Math.pow(2, k);
        System.out.println(p);
        System.out.println(ans);
        sc.close();
    }
}
