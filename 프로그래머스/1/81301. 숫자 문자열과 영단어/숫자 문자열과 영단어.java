import java.util.*;
class Solution {
    public int solution(String s) {
         Map<String, Integer> replaceMap = new HashMap<>();
            replaceMap.put("zero",0);
            replaceMap.put("one",1);
            replaceMap.put("two",2);
            replaceMap.put("three",3);
            replaceMap.put("four",4);
            replaceMap.put("five",5);
            replaceMap.put("six",6);
            replaceMap.put("seven",7);
            replaceMap.put("eight",8);
            replaceMap.put("nine",9);

            for(Map.Entry entry : replaceMap.entrySet()){
                if(s.indexOf(entry.getKey().toString()) > -1){
                    s = s.replace(entry.getKey().toString(), entry.getValue().toString());
                }
            }
            return Integer.parseInt(s);
    }
}