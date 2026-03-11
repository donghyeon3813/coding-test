import java.util.*;
class Solution {
    public int solution(String[][] book_time) {
        int[][] book_timeIntArr = new int[book_time.length][2];
        for(int i = 0; i < book_time.length; i++){
            String[] start_time = book_time[i][0].split(":");
            int startInt = Integer.parseInt(start_time[0]) * 60 + Integer.parseInt(start_time[1]);
            
            String[] end_time = book_time[i][1].split(":");
            int endInt = Integer.parseInt(end_time[0]) * 60 + Integer.parseInt(end_time[1]) + 10;
            book_timeIntArr[i][0] = startInt;
            book_timeIntArr[i][1] = endInt;    
        }
        Arrays.sort(book_timeIntArr, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        for(int i = 0; i < book_timeIntArr.length; i++){
            if(!queue.isEmpty() && queue.peek()[1] <= book_timeIntArr[i][0]){
                queue.poll();
            }
            queue.add(book_timeIntArr[i]);
        }
        
        return queue.size();
    }
}