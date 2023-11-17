import java.util.*;

public class CountDuplicateChar {
    public static void main(String[] args){

        System.out.println("Enter a String: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        CountDuplicateChars(s);

    }

    public static void CountDuplicateChars(String s){

        char[] arr = s.toCharArray();
        Map<Character,Integer> charMap = new HashMap<>();
        for(Character ch: arr){
            if(Character.isAlphabetic(ch)){
                if(charMap.containsKey(ch)){
                    int value = charMap.get(ch)+1;
                    charMap.replace(ch,value);
                }else{
                    charMap.put(ch,1);
                }

            }
        }

        for(Character ch: charMap.keySet()){
            int val = charMap.get(ch);
            if(val>1){
                System.out.println("Duplication occured: " + ch);
            }
        }
    }
}
