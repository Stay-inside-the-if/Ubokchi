class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int balance = 0;
        
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == '(')
                balance++;
            else if (s.charAt(i) == ')')
                balance--;
                
            if (balance < 0) {
                answer = false;
                break;
            }
        }
        
        if (balance != 0)
            answer = false;
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        
        return answer;
    }
}