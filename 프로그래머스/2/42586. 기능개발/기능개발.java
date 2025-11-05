import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList();
        Deque<Integer> deque = new ArrayDeque<>();
        for(int i = 0; i<progresses.length; i++){
            deque.offerLast((int) Math.ceil((100.0 - progresses[i]) / speeds[i]));
        }
        int temp = deque.pollFirst();
        int count = 1;
        while (!deque.isEmpty()) {
            
            int value = deque.pollFirst(); 
            
            if (value > temp) {
                answer.add(count);
                temp = value;
                count = 1;
            } else {
                count++;
            }
        }
        answer.add(count);
        
        
        return  answer.stream().mapToInt(Integer::intValue).toArray();
    }
}