class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = {};
        answer = new int[2];
        
        answer[0] = (numer1 * denom2) + (numer2 * denom1);
        answer[1] = denom1 * denom2;
        
        int GCD = getGcd(answer[0], answer[1]);
        
        answer[0] /= GCD;
        answer[1] /= GCD;
        
        return answer;
    }
    
    public int getGcd(int a, int b) {
        if (b == 0) 
            return a;
        else
            return getGcd(b, a % b);
    }
}