import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Map<String, Set<String>> map = new HashMap<>();
        
        for(String reportData : report){
            String[] data = reportData.split(" ");
            if(map.containsKey(data[1])){
                map.get(data[1]).add(data[0]);
            }else{
                Set<String> set = new HashSet<>();
                set.add(data[0]);
                map.put(data[1], set);
            }
        }
        for(Map.Entry<String, Set<String>> entry : map.entrySet()){
            
            if(entry.getValue().size() >= k){
                
                for(int i = 0; i < id_list.length; i++){
                    if(entry.getValue().contains(id_list[i])){
                        answer[i] = answer[i] +1;
                    }
                }
            }
        }
        
        return answer;
    }
}