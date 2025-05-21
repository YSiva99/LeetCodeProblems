package Solutions;

import java.util.*;

public class EncodeDecode {

    public String encode(List<String> strs){

    StringBuilder encoded=new StringBuilder();

    for(String str:strs){
        encoded.append(str.length()).append("#").append(str);
    }

    return encoded.toString();
    }

    public List<String> decode(String s){
        List<String> decoded=new ArrayList<>();
        int i=0;
        while(i<s.length()){
            int j=i;
            while(s.charAt(j)!='#'){
                j++;
            }

            int length=Integer.parseInt(s.substring(i,j));
            i=j+1;

            String word=s.substring(i,i+length);
            decoded.add(word);
            i+=length;
        }
        return decoded;
    }


    public static void main(String[] args){
        EncodeDecode codec=new EncodeDecode();

        List<String> input1=Arrays.asList("neet","code","love","you");
        String encoded1=codec.encode(input1);
        System.out.println("Encoded:"+encoded1);
        System.out.println("Decoded:"+codec.decode(encoded1));
    }

    
}
