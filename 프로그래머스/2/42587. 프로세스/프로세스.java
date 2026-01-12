import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int cnt = 0;
        
        int[] copy = Arrays.copyOf(priorities, priorities.length);
        Arrays.sort(copy);
        
        Queue<int[]> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack();
        
        for(int i = 0; i < priorities.length; i++){
            queue.offer(new int[]{i, priorities[i]});
            stack.add(copy[i]);
        }
        
        while(queue.size() != 0){
            int[] current = queue.poll();
            
            if(stack.peek() != current[1]){
                queue.offer(current);
            }else{
                stack.pop();
                cnt++;
                if(current[0] == location){
                    return cnt;
                }
            }
            
        }
        
        return cnt;
    }
}