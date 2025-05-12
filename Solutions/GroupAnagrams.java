package Solutions;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> map=new HashMap<>();

    for(String word:strs){
        char[] chars=word.toCharArray();
        Arrays.sort(chars);
        String sortedWord=new String(chars);

        map.computeIfAbsent(sortedWord,k->new ArrayList<>()).add(word);
    }

     return new ArrayList<>(map.values());

     

    }
    public static void main(String[] args) {

        String[] input = {"act", "pots", "tops", "cat", "stop", "hat"};

        List<List<String>> result = groupAnagrams(input);

        for (List<String> group : result) {
            System.out.println("out put:"+group);
        }
    }
    
}
