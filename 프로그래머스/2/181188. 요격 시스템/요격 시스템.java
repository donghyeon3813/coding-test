import java.util.*;
class Solution {
    public int solution(int[][] targets) {
        int answer = 0;
        Arrays.sort(targets, Comparator.comparingInt((int[] o) -> o[1]));
        int temp1 = targets[0][0];
        int temp2 = targets[0][1];
        int count = 1;
        for(int i = 1; i< targets.length; i++){
            
            if(temp2 > targets[i][0]){
            
                continue;
            }else{
                temp1 = targets[i][0];
                temp2 = targets[i][1];
                count++;
            }
        }
        return count;
    }
}