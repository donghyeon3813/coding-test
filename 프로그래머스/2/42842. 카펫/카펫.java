class Solution {
    public int[] solution(int brown, int yellow) {
        int total = brown + yellow;
        int[] answer = new int[2];

        for (int h = 1; h <= total; h++){
            if(total % h == 0){
                int w = total/h;
                if((w - 2) * (h - 2) == yellow){
                    answer[0] = w;
                    answer[1] = h;
                    break;
                }
            }
        }

        return answer; 
    }
}