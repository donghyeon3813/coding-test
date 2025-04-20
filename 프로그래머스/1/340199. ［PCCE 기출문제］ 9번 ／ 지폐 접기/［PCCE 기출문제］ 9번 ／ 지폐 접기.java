class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        int walletMax = Integer.MIN_VALUE;
        int walletMin = Integer.MAX_VALUE;
        for (int i = 0; i < wallet.length; i++) {
            walletMax = Math.max(wallet[i], walletMax);
            walletMin = Math.min(wallet[i], walletMin);
        }
        int billMax = Integer.MIN_VALUE;
        int billMin = Integer.MAX_VALUE;
        for (int i = 0; i < bill.length; i++) {
            billMax = Math.max(bill[i], billMax);
            billMin = Math.min(bill[i], billMin);
        }
        
        while(billMax > walletMax || billMin > walletMin) {
            int temp = billMax;
            billMax = Math.max(temp/2, billMin);
            billMin = Math.min(temp/2, billMin);
            answer++;
        }
            return answer;
    }
}