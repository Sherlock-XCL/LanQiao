import java.util.Scanner;

// 移动到末尾
// 把数组中所有 0 移动到末尾，其他元素相对位置保持不变
public class id316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ans = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x != 0) {
                ans[k] = x;
                k ++;
            }
        }
        for (int i = 0; i < n; i ++) {
            System.out.print(ans[i] + " ");
        }
        sc.close();
    }
}
