import java.util.*;
class Solution {
    public String solution(int[] food) {
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < food.length; i++){
                int preparedFoodCount = food[i] / 2;
                while (0 < preparedFoodCount){
                    answer.append(i);
                    preparedFoodCount--;
                }
            }
        return answer.toString() + 0 + answer.reverse();
    }
}