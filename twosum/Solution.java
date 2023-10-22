package twosum;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    //Resposta com complexidade (On²)
    public int[] badSolution(int[] nums, int target) {
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }

    //Resposta com complexidade (On)
    public int[] bestSolution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int value = target - nums[i];

            if (map.containsKey(value)) {
                return new int[] { map.get(value), i };
            }
            map.put(nums[i], i);
        }
        return null;
    }
}