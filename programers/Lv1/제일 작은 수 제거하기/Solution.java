import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1) {
            int[] answer = {-1};
            return answer;
        } else {
            int min = Arrays.stream(arr).min().getAsInt();
            return Arrays.stream(arr).filter(i -> i != min).toArray();
        }
    }
}