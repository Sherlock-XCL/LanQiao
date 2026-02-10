import java.util.*;

public class id299 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] aa = new int[105];
        for (int i = 1; i <= n; i ++) {
            aa[i] = sc.nextInt();
        }
        Arrays.sort(aa, 1, n + 1);
        for (int i = 1; i <= n; i ++) {
            System.out.print(aa[i] + " ");
        }
        sc.close();
    }
}
