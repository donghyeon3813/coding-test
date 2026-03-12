import java.util.*;
class Solution {
    public int[] solution(int[] fees, String[] records) {
        
        Map<String, Integer> inMap = new HashMap<>();
        Map<String, Integer> totalTimeMap = new TreeMap<>();
        for(int i = 0; i < records.length; i++){
            String[] info = records[i].split(" ");
            String[] timeArr = info[0].split(":");
            int time = Integer.parseInt(timeArr[0]) * 60 + Integer.parseInt(timeArr[1]);
            if(info[2].equals("IN")){
                inMap.put(info[1], time);
            }else{
                int totalTime = time - inMap.get(info[1]);
                totalTimeMap.put(info[1], totalTimeMap.getOrDefault(info[1], 0) + totalTime);
                inMap.remove(info[1]);
                
            }
        }
        for(Map.Entry<String, Integer> entry : inMap.entrySet()){
            int remainTime = ((60 * 23) + 59) - entry.getValue();
            totalTimeMap.put(entry.getKey(), totalTimeMap.getOrDefault(entry.getKey(), 0) + remainTime);
        }
        int[] answer = new int[totalTimeMap.size()];
        int index = 0;
        for(Map.Entry<String, Integer> entry : totalTimeMap.entrySet()){
            
            int totalTime = entry.getValue();
            System.out.println(totalTime);
            int price = 0;

            if(totalTime <= fees[0]){
                price = fees[1];
            } else {
                price = fees[1] + (((totalTime - fees[0]) / fees[2]) * fees[3]);

                if((totalTime - fees[0]) % fees[2] != 0){
                    price += fees[3];
                }
            }
            answer[index] = price;
            index++;
            
        }
    
        return answer;
    }
}