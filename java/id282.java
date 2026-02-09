import java.util.Scanner;

public class id282 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i ++) {
            String str = sc.next();
            int indexR = str.indexOf('R');
            int indexC = str.indexOf('C');
            String row = str.substring(indexR + 1, indexC); // 5
            String col = str.substring(indexC + 1); // 255
            int intCol = Integer.parseInt(col);
            StringBuffer sb = new StringBuffer();
            while (intCol > 0) {
                sb.append((char)('A' + intCol % 26 - 1)); // UI
                intCol /= 26;
            }
            System.out.print(sb.reverse());
            System.out.println(row);
        }
        sc.close();
    }
}
