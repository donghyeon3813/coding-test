import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Map<String, Integer> hashMap = new HashMap<>();
        for(int i = 0; i < phone_book.length; i++){
            hashMap.put(phone_book[i], 1);
        }
        for(String s : phone_book){
            for(int i = 1; i < s.length(); i++){
                String prefix = s.substring(0, i);
                if(hashMap.containsKey(prefix)){
                    return false;
                }
            }
        }
        
        return answer;
    }
}