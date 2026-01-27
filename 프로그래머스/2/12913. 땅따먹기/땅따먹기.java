class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int length = land.length;
        for(int i = 1; i < length; i++){
            land[i][0] += max(land[i-1][1], land[i-1][2], land[i-1][3]);
            land[i][1] += max(land[i-1][0], land[i-1][2], land[i-1][3]);
            land[i][2] += max(land[i-1][0], land[i-1][1], land[i-1][3]);
            land[i][3] += max(land[i-1][0], land[i-1][1], land[i-1][2]);
                
        }
        
        return max(land[length-1][0], land[length-1][1], land[length-1][2], land[length-1][3]);
    }
    public int max(int x, int y, int z){
        return Math.max(x, Math.max(y, z));
    }
    public int max(int a, int b, int c, int d){
        return Math.max(a, Math.max(b, Math.max(c, d)));
    }
}