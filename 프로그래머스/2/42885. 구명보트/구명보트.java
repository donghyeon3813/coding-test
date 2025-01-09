import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int answer = 0;
        int lignt = 0;
        int hevy = people.length - 1;
        while (lignt <= hevy){
            if(people[lignt] + people[hevy] <= limit){
                lignt++;
            }
            hevy--;
            answer++;
        }
        return answer;
    }
}