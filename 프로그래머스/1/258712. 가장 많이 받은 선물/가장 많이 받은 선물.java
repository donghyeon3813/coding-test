import java.util.*;
class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        Map<String, Integer> giftNumMap = new HashMap<>();
        Map<String, Integer> giveMap = new HashMap<>();
        
        for(String s : gifts){
            String[] gift = s.split(" ");
            giveMap.put(s, giveMap.getOrDefault(s, 0)+1);
            giftNumMap.put(gift[0], giftNumMap.getOrDefault(gift[0], 0)+1);
            giftNumMap.put(gift[1], giftNumMap.getOrDefault(gift[1], 0)-1);
            
        }
        
        int currentMaxCount = 0;
        for(int i = 0; i < friends.length; i++){
            int currentCount = 0;
            for(int j = 0; j < friends.length; j++){
                if(friends[i].equals(friends[j])){
                    continue;
                }
                
                int a = giveMap.get(friends[i] + " " +friends[j]) != null ? giveMap.get(friends[i] + " " +friends[j]) : 0;
                int b = giveMap.get(friends[j] + " " +friends[i]) != null ? giveMap.get(friends[j] + " " +friends[i]) : 0;
                if(a > b){
                    currentCount++;
                }else if(a == b){
                    int giftA =  giftNumMap.get(friends[i]) != null ? giftNumMap.get(friends[i]) : 0;
                    int giftB =  giftNumMap.get(friends[j]) != null ? giftNumMap.get(friends[j]) : 0;
                    if( giftA > giftB){
                        currentCount++;
                    }
                }
            }
            if(currentMaxCount < currentCount){
                currentMaxCount = currentCount;
            }
        }
        
        return currentMaxCount;
    }
}