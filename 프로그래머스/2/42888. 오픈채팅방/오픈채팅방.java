import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> nameMap = new HashMap<>();

        for(String s : record){
            String[] split = s.split(" ");
            String action = split[0];
            String uid = split[1];

            if(action.equals("Enter") || action.equals("Change")){
                String name = split[2];
                nameMap.put(uid, name);
            }
        }
        
        List<String> result = new ArrayList<>();

        for(String s : record){
            String[] split = s.split(" ");
            String action = split[0];
            String uid = split[1];

            if(action.equals("Enter")){
                result.add(nameMap.get(uid) + "님이 들어왔습니다.");
            } else if(action.equals("Leave")){
                result.add(nameMap.get(uid) + "님이 나갔습니다.");
            }
        }
        return result.toArray(String[]::new);
    }
}