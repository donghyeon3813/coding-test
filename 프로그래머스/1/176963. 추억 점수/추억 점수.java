import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = {};
        List nameList = Arrays.asList(name);
        answer = new int[photo.length];
        for(int i = 0; i<photo.length; i++){
            for(int j = 0; j<photo[i].length; j++){
                if(nameList.contains(photo[i][j])){
                    answer[i] += yearning[nameList.indexOf(photo[i][j])];
                }
            }
        }
        
        return answer;
    }
}