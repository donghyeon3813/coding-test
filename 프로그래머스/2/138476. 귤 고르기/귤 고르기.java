import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < tangerine.length; i++){
            map.put(tangerine[i], map.getOrDefault(tangerine[i], 0) + 1);
        }
        LinkedHashMap<Integer, Integer> result = map.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1,
                        LinkedHashMap::new
                ));
        for(Map.Entry entry : result.entrySet()){
            if(k > 0){
                k -= (int)entry.getValue();
                answer++;
            }
        }

        return answer;
    }
}