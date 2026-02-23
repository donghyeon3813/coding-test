import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        Set<String> set = new HashSet<>();
        
        set.add(words[0]);
        
        for (int i = 1; i < words.length; i++) {
            String prev = words[i - 1];
            String current = words[i];
            
            char prevLastChar = prev.charAt(prev.length() - 1);
            char currFirstChar = current.charAt(0);
            
            if (set.contains(current) || prevLastChar != currFirstChar) {
                return new int[]{ (i % n) + 1, (i / n) + 1 };
            }
            set.add(current);
        }

        return new int[]{0, 0};
    }
}