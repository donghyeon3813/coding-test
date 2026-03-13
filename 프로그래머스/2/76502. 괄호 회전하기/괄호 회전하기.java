import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        System.out.println(s);
        
        for(int i = 0; i < s.length(); i++){
            
            Stack<Character> stack = new Stack<>();    
            String temp = s.substring(i) + s.substring(0, i);
            boolean isValid = true;
            
            for(char c : temp.toCharArray()){
                if(c == '}' || c == ']' || c == ')'){
                    if(stack.isEmpty()){
                        isValid = false;
                        break;
                    }
                    if(c == '}' && stack.peek() == '{') {
                        stack.pop();
                    } else if(c == ']' && stack.peek() == '[') {
                        stack.pop();
                    } else if(c == ')' && stack.peek() == '(') {
                        stack.pop();
                    } else  {
                        isValid = false;
                        break;
                    }
                }else{
                    stack.push(c);
                }
            }
            if(isValid && stack.isEmpty()){
                answer++;
            }
            
        }
        return answer;
    }
}