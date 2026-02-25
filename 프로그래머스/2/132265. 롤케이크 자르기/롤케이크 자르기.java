import java.util.*;
class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < topping.length; i++){
            map.put(topping[i], map.getOrDefault(topping[i], 0)+1);
        }

        for(int t : topping){
            set.add(t);
            map.put(t, map.get(t)-1);
            if(map.get(t) == 0){
                map.remove(t);
            }
            if(set.size() == map.size()){
                answer++;
            }
        }
        
        return answer;
    }
}