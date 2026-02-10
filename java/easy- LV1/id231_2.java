import java.util.*;

public class id231_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        // 最终编号
        int ans = 0;
        // 旧编号 =（新编号 + k）% 当前总人数
        for (int i = 2; i <= n; i ++) {
            ans = (ans + k) % i;
        }
        System.out.println(ans + 1);
        sc.close();
    }
}