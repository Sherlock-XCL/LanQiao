import java.util.Scanner;

// 标题统计
public class id325 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for (char c : s.toCharArray()) {
            if (c <= 'z' && c >= 'a') {
                cnt ++;
            } else if (c <= 'Z' && c >= 'A') {
                cnt ++;
            } else if (c <= '9' && c >= '0') {
                cnt ++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
