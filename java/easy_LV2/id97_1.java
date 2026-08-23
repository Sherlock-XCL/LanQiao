package easy_LV2;

import java.util.Scanner;

// k倍区间
// 前缀和
public class id97_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            int sum = 0;
            for (int j = i; j < a.length; j++) {
                sum += a[j];
                if (sum % k == 0) {
                    cnt ++;
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
