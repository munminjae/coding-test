
//연속된 자연수의 합 구하기
//투포인터
import java.util.Scanner;

public class Silver_2018 {
    public static void main(String[] args) {
        System.out.print("숫자 입력 : ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int start_index = 1;
        int end_index = 1;
        int sum = 1;

        while(end_index!=N) {
            if(sum==N) {
                count++;
                end_index++;
                sum = sum + end_index;
            } else if(sum>N) {
                sum = sum - start_index;
                start_index++;
            } else {
                end_index++; 
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
