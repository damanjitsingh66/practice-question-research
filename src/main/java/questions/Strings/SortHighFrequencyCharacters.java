package questions.Strings;

import java.util.*;

public class SortHighFrequencyCharacters {

    public static void main(String[] args) {

        String str = "tree";

        Map<Character,Integer> frequencies = new HashMap<>(26);

        for(char c : str.toCharArray()){
            frequencies.put(c, frequencies.getOrDefault(c,0)+1);
        }
        System.out.println(frequencies);

        List<Character> characterList = new ArrayList<>(frequencies.keySet());
        characterList.sort((a,b)->frequencies.get(b) - frequencies.get(a));

        System.out.println(characterList);


//tc- O(n + k log k)
        //sc - O(k)
    }
}
