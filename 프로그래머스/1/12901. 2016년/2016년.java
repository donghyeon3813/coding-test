class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int dayCnt = 0;
        int month = 1;
        while (month < a){
            switch (month){
                case 1, 3, 5, 7, 8, 10, 12:
                    dayCnt += 31;
                    break;
                case 4, 6, 9, 11:
                    dayCnt += 30;
                    break;
                case 2:
                    dayCnt += 29;
                    break;
                    
            }
            month++;
        }
        dayCnt += b-1;
        int temp = dayCnt % 7;

        switch (temp){
            case 0:
                answer = "FRI";
                break;
            case 1:
                answer = "SAT";
                break;
            case 2:
                answer = "SUN";
                break;
            case 3:
                answer = "MON";
                break;
            case 4:
                answer = "TUE";
                break;
            case 5:
                answer = "WED";
                break;
            case 6:
                answer = "THU";
                break;
        }
        return answer;
    }
}