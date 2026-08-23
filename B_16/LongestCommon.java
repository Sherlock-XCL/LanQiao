package B_16;

public class LongestCommon{
    public static String longest(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i ++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, strs.length - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longest(strs));
    }
}
