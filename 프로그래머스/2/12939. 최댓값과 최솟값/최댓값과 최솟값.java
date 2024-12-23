class Solution {
    public String solution(String s) {
        String[] s1 = s.split(" ");
        int min = Integer.parseInt(s1[0]);
        int max = Integer.parseInt(s1[0]);

        for (int i = 1; i < s1.length; i++){
            int num = Integer.parseInt(s1[i]);
            if(min > num){
                min = num;
            }
            if(max < num){
                max = num;
            }
        }
        return min + " " + max;
    }
}