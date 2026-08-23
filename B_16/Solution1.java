package B_16;

public class Solution1 {
    public static void main(String[] args) {
        int ans = 0;
        for (long i = 1; i <= 2025; i ++) {
            if (i % 10 == 7) {
                ans ++;
            }
        }
        System.out.println(ans);
    }
}
