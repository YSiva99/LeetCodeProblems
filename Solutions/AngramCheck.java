package Solutions;

public class AngramCheck {
    public static boolean isAnagram(String s,String t){
        
        if(s.length()!=t.length()){
            return false;
        }
        int[] count=new int[26];

        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }

        for(int c:count){
            if(c!=0) return false;
        }
        return true;

    
    }
    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s, t)); // Output: true
    }
}
