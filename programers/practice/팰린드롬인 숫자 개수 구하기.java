package programers.practice;

public class Solution {
    public int solution(int n, int m) {
        int answer = 0;
        
        for(int i = 0; i<m-n; i++) {
            if(palindrameCheck((n+i))) {
                answer++;
            }
        }
        return answer;
    }

    public static boolean palindrameCheck(int number) {
        int beforeNumber = number;
        int afterNumber = 0;

        while(true) {
            int cal = number % 10;
            afterNumber = afterNumber * 10 + cal;
            number = number / 10;
            if(number==0) {
                break;
            }
        }

        return afterNumber==beforeNumber;
    }
}