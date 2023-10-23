package romantoint;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int midSolution(String s) {
        int result = 0;
        Map<String, Integer> numbers = new HashMap<>();
        numbers.put("I", 1);
        numbers.put("V", 5);
        numbers.put("X", 10);
        numbers.put("L", 50);
        numbers.put("C", 100);
        numbers.put("D", 500);
        numbers.put("M", 1000);
        numbers.put("IV", 4);
        numbers.put("IX", 9);
        numbers.put("XL", 40);
        numbers.put("XC", 90);
        numbers.put("CD", 400);
        numbers.put("CM", 900);

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ((i + 1) < arr.length) {
                String str = "";
                str += arr[i];
                str += arr[i + 1];
                if (numbers.containsKey(str)) {
                    result += numbers.get(str);
                    i++;
                    continue;
                }
            }
            result += numbers.get(Character.toString(arr[i]));
        }

        return result;
    }

    public int bestSolution(String s) {
        int result = 0;
        Map<Character, Integer> numbers = new HashMap<>();
        numbers.put('I', 1);
        numbers.put('V', 5);
        numbers.put('X', 10);
        numbers.put('L', 50);
        numbers.put('C', 100);
        numbers.put('D', 500);
        numbers.put('M', 1000);

        char[] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            int num = numbers.get(arr[i]);

            if ((i - 1) >= 0) {
                if (numbers.get(arr[i - 1]) < num) {
                    result += (num - numbers.get(arr[i - 1]));
                    i = i - 1;
                    continue;
                }
            }
            result += numbers.get(arr[i]);
        }

        return result;
    }
}