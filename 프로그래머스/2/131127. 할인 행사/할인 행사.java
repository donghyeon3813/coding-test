import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int totalCount = 0; 
        Map<String, Integer> wantMap = new HashMap<>();
        for(int i = 0; i < want.length; i++){
            wantMap.put(want[i], number[i]);
        }
        
        
        for(int i = 0; i < discount.length; i++){
            
            Map<String, Integer> discountMap = new HashMap<>();
            for(int j = 0; j < 10; j++){
                if(i + j == discount.length){
                    return answer;
                }
                String currentProduct = discount[j + i];
                discountMap.put(currentProduct, discountMap.getOrDefault(currentProduct, 0) + 1);
            }
            if(wantMap.equals(discountMap)){
                answer++;
            }
            
        }
        return answer;
    }
}