class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean isStart = true; 

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (currentChar == ' ') {
                answer.append(currentChar);
                isStart = true;
            } else if (isStart) {
                answer.append(Character.toUpperCase(currentChar));
                isStart = false; 
            } else {
                answer.append(Character.toLowerCase(currentChar)); 
            }
        }

        return answer.toString();
    }
}