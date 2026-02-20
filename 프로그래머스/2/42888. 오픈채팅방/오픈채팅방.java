import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        
        Map<String, String> nameMap = new HashMap<>();
        List<String[]> logs = new ArrayList<>();

        for (String s : record) {
            String[] split = s.split(" ");
            String action = split[0];
            String uid = split[1];

            if (action.equals("Enter") || action.equals("Change")) {
                nameMap.put(uid, split[2]);
            }

            if (!action.equals("Change")) {
                logs.add(new String[]{action, uid});
            }
        }

        String[] answer = new String[logs.size()];

        for (int i = 0; i < logs.size(); i++) {
            String[] log = logs.get(i);
            String action = log[0];
            String uid = log[1];

            if (action.equals("Enter")) {
                answer[i] = nameMap.get(uid) + "님이 들어왔습니다.";
            } else {
                answer[i] = nameMap.get(uid) + "님이 나갔습니다.";
            }
        }

        return answer;
    }
}