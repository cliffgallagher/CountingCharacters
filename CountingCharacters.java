import java.util.HashMap;

public class CountingCharacters {

    public static void main(String[] args) {
        //System.out.println("Hello world");

        String charactersToCount = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";

        HashMap<Character, Integer> characterMap = new HashMap<>();

        //System.out.println(charactersToCount);

        for (int i =0; i < charactersToCount.length(); i++) {
            if (!characterMap.keySet().contains(charactersToCount.charAt(i))) {
                characterMap.put(charactersToCount.charAt(i), 1);
            } else {
                Integer currentValue = characterMap.get(charactersToCount.charAt(i));
                currentValue++;
                characterMap.replace(charactersToCount.charAt(i), currentValue);
            }
        }

        System.out.println(characterMap.toString());
    }
}