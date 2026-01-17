import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int num : scoville){
            queue.add(num);
        }
        if(queue.peek() > K){
            return -1;
        }
        while(queue.peek() < K){
            if(queue.size() == 1){
                return -1;
            }
            answer++;
            int n1 = queue.poll();
            int n2 = queue.poll();
            int addNum = n1 + (n2 * 2);
            queue.add(addNum);
        }
        return answer;
    }
}