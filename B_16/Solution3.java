package B_16;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t -- > 0) {
            int n = sc.nextInt();
            int ans = 0;
            while (n --  > 0) {
                ans ^= sc.nextInt();
            }
            if (ans == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
