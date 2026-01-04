import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n  = maps.length;
        int m = maps[0].length;
        
        //방문한 위치에 좌표 값을 큐에 넣는다.
        Queue<int[]> queue = new LinkedList();
        //처음 좌표값 을 넣어준다.
        queue.offer(new int[]{0,0});
        // 상하 좌우 이동을 나타내는 배열
        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};
        //queue가 빌때까지
        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            
            //현재 current값이 도달했으면 return
            if(x == n -1 && y == m -1){
                return maps[x][y];
            }
            // 상하좌우 이동했을때를 고려한 반복문
            for(int i = 0; i < 4; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                
                //다음 이동할 좌표가 maps의 길이를 벗어나면 계산할 필요가 없음
                if(nx < 0 || nx >= n || ny < 0 || ny >= m){
                    continue;
                }
                //1번 들린곳만 이동할 수 있게 제한
                if(maps[nx][ny] == 1){
                    queue.offer(new int[]{nx, ny});
                    maps[nx][ny] = maps[x][y] + 1;    
                }
                
            }
            
        }
        
    
        return -1;
    }
}