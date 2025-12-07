package Solutions;

public class FirstOccurance {
    public static int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        if (m > n)
            return -1;

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && haystack.charAt(i + j) == needle.charAt(j))
            // i=0,j=0 0<6 && s==s
            // i=0,j=1. 1<6 && (1)=(1). a==a
            // i=0, j=2 2<6 && (2)=(2). d==d
            // i=0, j=3 3<6 && (3)==(3) b==null
            {
                j++;
            }
            if (j == m) {
                return i;
            }
        }
        return -1;

        // // if needle is longer than haystack → impossible
        // if (needle.length() > haystack.length())
        // return -1;

        // // loop through haystack windows
        // for (int i = 0; i <= haystack.length() - needle.length(); i++) {

        // // take substring of same length as needle
        // String sub = haystack.substring(i, i + needle.length());

        // // compare
        // if (sub.equals(needle)) {
        // return i; // match found
        // }
        // }

        // // no match found
        // return -1;

    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        System.out.println("The Index of the First Occurrence in a String:" + strStr(haystack, needle));
    }
}