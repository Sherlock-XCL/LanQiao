import java.util.Scanner;

// 扫雷游戏
public class id358 {
    private static Integer calculate(char[][] a, int i, int j) {
        int c = 0;
        if (a[i - 1][j] == '*') c ++;
        if (a[i - 1][j - 1] == '*') c ++;
        if (a[i - 1][j + 1] == '*') c ++;
        if (a[i + 1][j] == '*') c ++;
        if (a[i + 1][j - 1] == '*') c ++;
        if (a[i + 1][j + 1] == '*') c ++;
        if (a[i][j - 1] == '*') c ++;
        if (a[i][j + 1] == '*') c ++;
        return c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        char[][] a = new char[n + 2][m + 2];
        int[][] ans = new int[n][m];
        for (int i = 1; i <= n; i++) {
            String str = sc.next();
            for (int j = 1; j <= m; j++) {
                a[i][j] = str.charAt(j - 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i + 1][j + 1] == '*') {
                    ans[i][j] = 99;
                } else {
                    ans[i][j] = calculate(a, i + 1, j + 1);
                }
            }
        }
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (ans[i][j] == 99) {
                    System.out.print('*');
                } else {
                    System.out.print(ans[i][j]);
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
