package easy_LV2;

import java.util.Scanner;

// k倍区间
// 前缀和
// a [1, 2, 3, 4, 5]
// s [1, 3, 6, 10, 15]

// a[1] ... a[3] = s[3] - s[0]
// a[3] ... a[4] = s[4] - s[2]
public class id97_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long cnt = 0;
        int[] modCount = new int[k];
        int prefixMod = 0;
        modCount[0] = 1;
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            prefixMod = (prefixMod + (val % k) + k) % k;
            cnt += modCount[prefixMod];
            modCount[prefixMod]++;
        }
        System.out.println(cnt);
        sc.close();
    }
}
