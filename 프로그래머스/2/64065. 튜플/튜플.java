import java.util.*;
class Solution {
    public int[] solution(String s) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        String[] textArr = s.replace("{","").replace("}","").split(",");
        for(String text : textArr){
            Integer a = Integer.parseInt(text);
            map.put(a, map.getOrDefault(a, 0)+1);
        }
        int[] answer = new int[map.size()];
        int index = 0;
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        for (Map.Entry<Integer, Integer> entry : list) {
            answer[index] = entry.getKey();
            index++;
        }
        
        return answer;
    }
}