class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        for (int i = 0; i < schedules.length; i++) {
            int wish = schedules[i];


            int hour = wish / 100;
            int min = wish % 100;

            min += 10;
            if (min >= 60) {
                hour += 1;
                min -= 60;
            }

            int endLine = hour * 100 + min;

            int count = 0;
            for (int j = 0; j < 7; j++) {
                int dayOfWeek = (startday - 1 + j) % 7;
                if (dayOfWeek == 5 || dayOfWeek == 6) { 
                    continue;
                }

                if (timelogs[i][j] <= endLine) {
                    count++;
                }
            }

            if (count == 5) {
                answer++;
            }
        }

    return answer;
    }
}