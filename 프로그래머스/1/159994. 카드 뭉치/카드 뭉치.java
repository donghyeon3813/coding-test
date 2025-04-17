class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int acount = 0;
        int bcount = 0;

        for (String word : goal) {
            if (acount < cards1.length && word.equals(cards1[acount])) {
                acount++;
            } else if (bcount < cards2.length && word.equals(cards2[bcount])) {
                bcount++;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}