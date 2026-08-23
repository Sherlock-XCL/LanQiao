package B_16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution4 {

    static int[]prime = new int[20005];
    static boolean st[] = new boolean[20005];
    static int cnt = 0;
    static Set<Integer> set = new HashSet<>();
    static int num;

    private static boolean judge(int s) {
        if (s == 1) return false;
        for (int i = 2; i <= Math.sqrt(s); i ++) {
            if (s % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i ++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i ++) {
            b[i] = sc.nextInt();
        }
        int[] cnt = new int[40005];
        Arrays.sort(a);
        Arrays.sort(b);
        // 2 3 10
        // 1 3 4 5
        int ans = 0;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                int s = a[i] + b[j];
                if (s > n + m) break;
                if (cnt[s] == 0 && judge(s)) {
                    ans ++;
                    cnt[s] = 1;
                }
            }
        }
        System.out.println(ans);
        sc.close();
    }

    public static void creat(){
        //这是只需要筛选出num以内的素数即可，因为超过num的素数我们根本判断不到
        // i = 4 cnt = 2
        for(int i=2;i<=num;i++){
            if(!st[i]){
                prime[cnt++]=i;
                set.add(i);
            }
            for(int j=0;j<cnt;j++){
                if(i*prime[j]>num)break; // 2, 3
                st[i*prime[j]]=true;
                if(i%prime[j]==0)break;
            }
        }
    }
}
