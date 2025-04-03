import java.util.*;
class Solution {
    public int solution(int[] ingredient) {

            int answer = 0;
            LinkedList<Integer> list = new LinkedList<>();
            for (int a : ingredient) {
                list.add(a);

                if (list.size() >= 4 && list.get(list.size() - 4) == 1 && list.get(list.size() - 3) == 2
                        && list.get(list.size() - 2) == 3 && list.get(list.size() - 1) == 1) {
                    answer++;
                    for (int i = 0; i < 4; i++) {
                        list.removeLast();
                    }
                }
            }
            return answer;
        }
}