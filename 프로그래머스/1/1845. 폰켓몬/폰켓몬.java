import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            hashMap.put(num, hashMap.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        for (Map.Entry<Integer, Integer> entity : list) {
            if (answer < nums.length / 2) {
                answer++;
            } else {
                return answer;
            }
        }
        return answer;
    }
}