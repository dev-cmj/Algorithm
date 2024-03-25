class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        /*
        분자 number = numer1 * denom2 + numer2 * denom1 = 10
        분모 denom = denom1 * denom2 = 8
        10/8 = 5/4
        기약분수 = 약분이 끝난 상태.
        */
        
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;
        
        int gcd = gcd(numer, denom);

        numer /= gcd;
        denom /= gcd;
        
            // 1차 답안
//         int max = 1;
        
        
//         for(int i=1; i<=numer && i<=denom; i++) {
//             if(denom%i == 0 && numer%i == 0) {
//                 max = i;
//             }
//         }
        
//         numer = numer / max;
//         denom = denom / max;
        
        
        int[] answer = {numer, denom};
        return answer;
    }
        
        //2차 답안 유클리도 호제법
        private int gcd(int a, int b) {
            
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
            
        return Math.abs(a);
            
        }
}