import java.util.*;
class Solution {
    char[] arr = {'A','E','I','O','U'};
    List<String> dictionary = new ArrayList<>();
    public int solution(String word) {
        
        search(new StringBuilder());
        return dictionary.indexOf(word)+1;
    }
    
    public void search(StringBuilder s){
        if( s.length() == 5){
            return;
        }
        
        for(int i = 0; i < 5; i++){
            
            s.append(arr[i]);
            dictionary.add(s.toString());
            search(s);
            s.deleteCharAt(s.length()-1);
        }
    }
}