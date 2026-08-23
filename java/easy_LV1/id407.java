import java.util.Scanner;

// 数字统计
/**
 * 请统计某个给定范围[L,R] 的所有整数中，数字 2 出现的次数。
 */
public class id407 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();
        int count = 0;
        for (int i = l; i <= r; i++) {
            String str = String.valueOf(i);
            for (char c : str.toCharArray()) {
                if (c == '2') {
                    count ++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
