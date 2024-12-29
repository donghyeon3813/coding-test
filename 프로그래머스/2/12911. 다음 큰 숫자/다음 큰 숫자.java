import java.util.*;
class Solution {
    public int solution(int n) {
        long orgNumberBitCount = Integer.bitCount(n);
        n++;
        long nextNumberBitCount = Integer.bitCount(n);
        while(orgNumberBitCount != nextNumberBitCount){
            n++;
            nextNumberBitCount = Integer.bitCount(n);
        }

        return n;
    }
}