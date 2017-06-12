import java.util.LinkedHashMap;
import java.util.Map;
/**
 * Created by Duncan on 12/06/2017.
 */
public class RomanNumeral {

    public static String generate(int i){
        LinkedHashMap<String, Integer> numeralMap = populateNumeralMap();
        String numeralOutput = "";

        while (i > 0) {
            for(Map.Entry<String, Integer> entry : numeralMap.entrySet()){
                if (i > (entry.getValue() -1 )){
                    numeralOutput += entry.getKey();
                    i-=entry.getValue();
                    break;
                }
            }
        }
        return numeralOutput;
    }

    private static LinkedHashMap<String, Integer> populateNumeralMap() {
        LinkedHashMap<String, Integer> populatedMap = new LinkedHashMap<>();
        populatedMap.put("M", 1000);
        populatedMap.put("CM", 900);
        populatedMap.put("D", 500);
        populatedMap.put("CD", 400);
        populatedMap.put("C", 100);
        populatedMap.put("XC", 90);
        populatedMap.put("L", 50);
        populatedMap.put("XL", 40);
        populatedMap.put("X", 10);
        populatedMap.put("IX", 9);
        populatedMap.put("V", 5);
        populatedMap.put("IV", 4);
        populatedMap.put("I", 1);
        return populatedMap;
    }
}
