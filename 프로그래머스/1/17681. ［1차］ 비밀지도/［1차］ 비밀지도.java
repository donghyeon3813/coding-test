class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        
        String[] answer = new String[n];
        System.out.println();
        for(int i = 0; i < n; i++){
            answer[i] = String.format("%" + n +"s", Integer.toBinaryString(arr1[i] | arr2[i])).replaceAll("0"," ").replaceAll("1","#");
        }
        return answer;
    }
}