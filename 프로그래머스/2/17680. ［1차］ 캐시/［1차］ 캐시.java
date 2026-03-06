import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        
        if (cacheSize == 0) {
            return cities.length * 5;
        }
        
        int answer = 0;
        
        Set<String> set = new LinkedHashSet<>();
        for(int i = 0; i < cities.length; i++){
            String s = cities[i].toLowerCase();
            if(!set.contains(s)){
                answer+=5;
                if(set.size() >= cacheSize){
                    set.remove(set.iterator().next());
                }
                set.add(s);
            }else{
                answer++;
                set.remove(s);
                set.add(s);
            }
            
        }
        return answer;
    }
}