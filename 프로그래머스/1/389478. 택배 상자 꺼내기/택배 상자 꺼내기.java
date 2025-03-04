class Solution {
    public int solution(int n, int w, int num) {
        int answer = 1;
        //n = 22, w = 6 num = 8
        int count = 0;
        int a = n%w == 0 ? n/w : (n/w)+1;
        int [][] temp = new int [a][w];
        int currentW  = 0;
        for (int i = 0; i< a; i++) {
            if(count == n){
                break;
            }
            for(int j = 0; j < w; j++) {
                count++;
                if(count > n){
                    return answer;
                }
                int jtemp = i%2==0 ? j : w-1-j;
                if(i%2==0){
                    temp[i][jtemp] = count;
                }else{
                    temp[i][jtemp] = count;
                }
                if( num == count){
                    currentW = jtemp;
                }
                if( num < count && currentW == jtemp){
                    answer++;
                }

            }

        }
    
        return answer;
    }
}