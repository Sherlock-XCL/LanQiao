import java.util.*;

public class id276 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        for (int i = 1; i <= n; i ++) {
            String str = sc.next();
            char[] charArray = str.toCharArray();
            int len = charArray.length;
            int sum = 0;
            // 先特殊判断 I，X，C，M的个数
            Map<Integer, Integer> baeMap = new HashMap<>();
            Map<Integer, Integer> valueMap = new HashMap<>();
            for (int j = 0; j < len - 1; j ++) {
                if (charArray[j] == charArray[j + 1]) {
                    int begin = j;
                    int x = map.get(charArray[j]);
                    int k = 1;
                    while (j < charArray.length - 1 && charArray[j] == charArray[j + 1]) {
                        k ++;
                        j ++;
                    } 
                    baeMap.put(j, begin);
                    valueMap.put(j, x * k);
                }
            }
            // DCCII 702            // 右大左小 要减
            // 500 200 2
            int j = len - 2;
            if (baeMap.get(len - 1) != null) {
                sum = valueMap.get(len - 1);
                j = baeMap.get(len - 1) - 1;
            } else {
                sum = map.get(charArray[len - 1]);
            }
            while(j >= 0) {
                if (baeMap.get(j) != null) {
                    int sum1 = valueMap.get(j);
                    if (sum > sum1) {
                        sum -= sum1;
                    } else {
                        sum += sum1;
                    }
                    j = baeMap.get(j) - 1;
                } else {
                    // 非连续 则判断左右大小
                    if (sum > map.get(charArray[j])) {
                        sum -= map.get(charArray[j]);
                    } else {
                        sum += map.get(charArray[j]);
                    }
                    j --;
                }
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
