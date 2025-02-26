import java.util.HashMap;
import java.util.Map;

public class Sollution {

    public static boolean wordPattern(String pattern, String s) {

        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;

        Map<Character,String> mapA = new HashMap<>();
        Map<String,Character> mapB = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char charA = pattern.charAt(i);
            String stringB = arr[i];

            if(mapA.containsKey(charA) && !mapA.get(charA).equals(stringB)) return false;
            if(mapB.containsKey(stringB) && mapB.get(stringB) != charA) return false;

            mapA.put(charA,stringB);
            mapB.put(stringB,charA);
        }

        return true;

    }


}