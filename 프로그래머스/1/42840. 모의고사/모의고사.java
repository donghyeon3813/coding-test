import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] answer = new int[3];
        int[][] AnswerArr = {{1,2,3,4,5},{2,1,2,3,2,4,2,5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        
        for(int i = 0; i < answers.length; i++){
            int currentAnswer = answers[i];
            
            if(answers[i] == AnswerArr[0][i % 5]) {
                answer[0]++;
            }
            if(answers[i] == AnswerArr[1][i % 8]) {
                answer[1]++;
            }
            if(answers[i] == AnswerArr[2][i % 10]) {
                answer[2]++;
            }
        }
        PriorityQueue<int[]> queue = new PriorityQueue<>((t1, t2) -> {
            return t2[1] - t1[1];
        });
        
        int max = Arrays.stream(answer).max().getAsInt();                        
        for(int i = 0; i < answer.length; i++){
            if(answer[i] == max){
                queue.add(new int[]{i + 1, answer[i]});
            }
        }
        
        int[] result = new int[queue.size()];
        for(int i = 0; i < result.length; i++){
            
            int[] data = queue.poll();
            result[i] = data[0];
        }
        Arrays.sort(result);
        return result;
    }
}