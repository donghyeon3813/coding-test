import java.util.*;
class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        int tempTime = 0;
        for(String s : musicinfos){
            
            String[] split = s.split(",");
            String start[] = split[0].split(":");
            int startTime = (Integer.parseInt(start[0]) * 60) + Integer.parseInt(start[1]);
            
            
            String end[] = split[1].split(":");
            int endTime = (Integer.parseInt(end[0]) * 60) + Integer.parseInt(end[1]);
            
            int time = endTime - startTime;
            String title = split[2];
            String melody = replaceMelody(split[3]);
            String totalMelody = "";
            for(int i = 0; i<time; i++){
                
                int index = i % melody.length();
                
                totalMelody += melody.charAt(index);
            }
            
            if(totalMelody.contains(replaceMelody(m)) && tempTime < time){
                answer = title;
                tempTime = time;
                
            }
            
        }
        return tempTime == 0 ? "(None)" : answer;
    }
    public String replaceMelody(String str) {
        str = str.replace("C#", "c");
        str = str.replace("D#", "d");
        str = str.replace("F#", "f");
        str = str.replace("G#", "g");
        str = str.replace("A#", "a");
        str = str.replace("B#", "b");
        str = str.replace("E#", "e");
    return str;
    }
}
