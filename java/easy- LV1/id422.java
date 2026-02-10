// 最大公共子串
public class id422 {
    static int f(String s1, String s2)
    {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        // a[i][j] 表示 c1的前i个和c2的前j个点公共字符串长度
        int[][] a = new int[c1.length+1][c2.length+1];
        
        int max = 0;
        for(int i=1; i<a.length; i++){
            for(int j=1; j<a[i].length; j++){
                if(c1[i-1]==c2[j-1]) {
                    a[i][j] = Math.max(a[i - 1][j - 1] + 1, a[i][j]); 
                    if(a[i][j] > max) max = a[i][j];
                }
            }
        }
        
        return max;
    }
    
    public static void main(String[] args){
        int n = f("abcdkkk", "baabcdadabc");
        System.out.println(n);
        System.out.println(f("aaakkkabababa", "baabababcdadabc"));
        System.out.println(f("abccbaacbcca", "ccccbbbbbaaaa"));
        System.out.println(f("abcd", "xyz"));
        System.out.println(f("ab", "ab"));
        
    }
}