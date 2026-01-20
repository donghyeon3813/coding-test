import java.util.*;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();
        Map<String, Integer> termsMap = new HashMap<>();

        for (String term : terms) {
            String[] termArr = term.split(" ");
            termsMap.put(termArr[0], Integer.parseInt(termArr[1]));
        }

        int todayTotal = getDateToDays(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split(" ");
            String date = privacy[0];
            String type = privacy[1];

            int privacyDateTotal = getDateToDays(date);
            
            int termMonth = termsMap.get(type);
            int expireDateTotal = privacyDateTotal + (termMonth * 28) - 1;

            if (expireDateTotal < todayTotal) {
                answerList.add(i + 1);
            }
        }

        int[] answer = new int[answerList.size()];
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    private int getDateToDays(String date) {
        String[] parts = date.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}