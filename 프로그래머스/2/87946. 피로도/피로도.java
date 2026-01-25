class Solution {
    boolean[] visited = new boolean[8];
    int maxCount = 0;
    public int solution(int k, int[][] dungeons) {
        int answer = -1;
        dfs(0, dungeons, k);
        return maxCount;
    }
    public void dfs(int count, int[][] dungeons, int k) {
        
        if(maxCount < count){
            maxCount = count; 
        }
        for(int i =0; i < dungeons.length; i++){
            if(visited[i] == false && k >= dungeons[i][0]){
                visited[i] = true;
                dfs(count+1, dungeons, k - dungeons[i][1]);
                visited[i] = false;
            }
            
        }
    }
}
//