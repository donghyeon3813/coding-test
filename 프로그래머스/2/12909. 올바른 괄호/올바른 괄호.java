import java.util.*;
class Solution {
    boolean solution(String s) {

        Queue<Character> cQueue = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                cQueue.add(c); 
            } else if (c == ')') {
                if (cQueue.isEmpty()) {
                    return false; 
                }
                cQueue.poll(); 
            }
        }
        return cQueue.isEmpty();
        
    }
}