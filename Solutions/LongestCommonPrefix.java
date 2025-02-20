package Solutions;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0)
            return "";

        String prefix = strs[0]; // flower

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) { // flow.indexOf(flower)!=0, flow.indexOf(flowe)!=0,
                prefix = prefix.substring(0, prefix.length() - 1); // flowe,flow,flo
                System.out.println(prefix);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

    // Example usage
    public static void main(String[] args) {
        LongestCommonPrefix solution = new LongestCommonPrefix();

        System.out.println(solution.longestCommonPrefix(new String[] { "flower", "flow", "flight" })); // Output: "fl"
        System.out.println(solution.longestCommonPrefix(new String[] { "dog", "racecar", "car" })); // Output: ""
    }
}
