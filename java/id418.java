import java.util.*;

// 字母组串
public class id418 {
    // 1个A，2个B，3个C 字母，能组成多少个不同的长度为3的串。
    // ABB
    // BAB
    // BBA

    // ACC
    // CCA
    // CAC

    // CBB
    // BCB
    // BBC

    // BCC
    // CCB
    // CBC

    // CCC

    // ABC
    // ACB
    // BCA
    // BAC
    // CAB
    // CBA

    // a个A，b个B，c个C 字母，能组成多少个不同的长度为n的串。
    static int f(int a, int b, int c, int n) {
        if (a < 0 || b < 0 || c < 0)
            return 0;
        if (n == 0)
            return 1;

        return f(a - 1, b, c, n - 1) +
                f(a, b - 1, c, n - 1) +
                f(a, b, c - 1, n - 1); // 填空
    }

    public static void main(String[] args) {
        System.out.println(f(1, 1, 1, 2));
        System.out.println(f(1, 2, 3, 3));
    }
}