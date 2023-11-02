class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        boolean[] hasNumber = new boolean[10];
        
        for (int num : numbers) {
            hasNumber[num] = true;
        }
        
        for (int i = 0; i < hasNumber.length; i++) {
            if (!hasNumber[i]) {
                answer += i;
            }
        }

        return answer;
    }
}