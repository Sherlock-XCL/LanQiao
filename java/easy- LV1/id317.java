import java.util.ArrayList;
import java.util.Scanner;

// 其他元素的乘积
/*
    3
    0 1 2 0

    2 0 0
 */
public class id317 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> zeroIndex = new ArrayList<>();
        boolean zeroFlag = false;
        int x = 1;
        for (int i = 0; i < n; i ++) {
            a[i] = sc.nextInt();
            if (a[i] == 0) {
                // 除了 0 的索引位置“可能”不是 0 ，其他全是 0
                zeroIndex.add(i);
                zeroFlag = true;
            } else {
                x *= a[i];
            }
        }
        if (zeroFlag == false) {
            for (int i = 0; i < n; i ++) {
                System.out.print(x / a[i] + " ");
            }
        } else {
            if (zeroIndex.size() > 2) {
                for (int i = 0; i < a.length; i++) {
                    System.out.print(0 + " ");
                }
            } else { 
                // 只有一个 0，那么除了这个位置，其他位置全是 0
                for (int i = 0; i < a.length; i++) {
                    if (i == zeroIndex.get(0)) {
                        System.out.print(x + " ");
                    } else {
                        System.out.print(0 + " ");
                    }
                }
            }
        }
        sc.close();
    }
}
