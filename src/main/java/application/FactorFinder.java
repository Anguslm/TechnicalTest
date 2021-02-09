package application;

import java.util.HashMap;
import java.util.Map;

public class FactorFinder {
    public String convert(int input) {
        //Creates a map of factors and their corresponding strings
        HashMap<Integer, String> factorMap = new HashMap<Integer, String>();
        factorMap.put(3, "Pling");
        factorMap.put(5, "Plang");
        factorMap.put(7, "Plong");
        StringBuilder outputString = new StringBuilder();

        //Checks for each possible factor in hashmap
        for (Map.Entry<Integer, String> entry: factorMap.entrySet()) {
            if (input % entry.getKey() == 0) {
                outputString.append(entry.getValue());
            }
        }

        //Adds input as a string if no factors found
        if (outputString.length() == 0) {
            outputString.append(input);
        }

        return outputString.toString();
    }
}
