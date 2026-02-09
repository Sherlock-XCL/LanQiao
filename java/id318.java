import java.util.Scanner;

// 寻找岛屿的周长
public class id318 {
    // 探测周围是否是陆地
    private static Integer calculateSide(int[][] a, int i, int j) {
        int k = 0;
        if (a[i - 1][j] == 0) {
            k ++;
        }
        if (a[i + 1][j] == 0) {
            k ++;
        }
        if (a[i][j - 1] == 0) {
            k ++;
        }
        if (a[i][j + 1] == 0) {
            k ++;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n + 2][m + 2];
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int cnt = 0;
        for (int i = 1; i <= n; i ++) {
            for (int j = 1; j <= m; j++) {
                if (a[i][j] == 1) {
                    cnt += calculateSide(a, i, j);
                }
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
