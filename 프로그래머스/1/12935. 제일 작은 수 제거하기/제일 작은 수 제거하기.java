class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[arr.length-1];
        
        int min = arr[0]; //하나의 값을 기준으로 잡음.
        
        for(int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        
        int index = 0;  
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) {
                continue;
            }
            
            answer[index++] = arr[i];
        }
        
        return answer;
 
    }
}