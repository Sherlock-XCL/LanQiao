import java.util.*;

public class id277 {
    private static void f(String str) {
        System.out.println("1");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n > 0) {
            String str = sc.next();
            f(str);
            n --;
        }

        /*
            ArrayList<char[]> arrayList=new ArrayList<>();
            int i;
            for(i=0;i<(int)cs.length;i+=6) {
                arrayList.add(Arrays.copyOfRange(cs, i, i+6));
            }
        */

        // charAt(m)-'0'

        sc.close();
    }
}
