import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class id231_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new ConcurrentLinkedQueue<>();
        // 初始化
        for (int i = 1; i <= n; i ++) {
            q.add(i);
        }
        while (q.size() > 1) {
            for (int i = 1; i < k; i ++) {
                int c = q.poll();
                q.add(c);
            }
            // 剔除第k个元素
            q.poll();
        }
        System.out.println(q.peek());
        sc.close();
    }
}