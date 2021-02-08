package application;

import java.util.HashMap;
import java.util.Map;

public class FactorFinder {
    public String convert(int input) {
        HashMap<Integer, String> factorMap = new HashMap<Integer, String>();
        factorMap.put(3, "Pling");
        factorMap.put(5, "Plang");
        factorMap.put(7, "Plong");
        StringBuilder outputString = new StringBuilder();
        for (Map.Entry<Integer, String> entry: factorMap.entrySet()) {
            if (input % entry.getKey() == 0) {
                outputString.append(entry.getValue());
            }
        }
        if (outputString.length() == 0) {
            outputString.append(input);
        }
        return outputString.toString();
    }

    public static void main(String[] args) {
        FactorFinder f = new FactorFinder();
        System.out.println(f.convert(0));
    }
}
