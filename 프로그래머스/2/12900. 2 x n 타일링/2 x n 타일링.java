class Solution {
    public int solution(int n) {
        int answer = 0;
        int prev1 = 1;
        int prev2 = 2;
        for(int i = 3; i<=n; i++){
            answer = (prev1 + prev2) % 1000000007;
            prev1 = prev2;
            prev2 = answer;
        }
        return answer;
    }
}