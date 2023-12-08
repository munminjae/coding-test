package baekjoon.bronze;
/*
    1번째 줄에 숫자의 개수 N(1 <= N <= 10), 2번째 줄에 숫자 N개가 공백 없이 주어진다.
    -> 100까지이므로 int, long형과 같은 숫자형으로 받을 수 없다.
 */

import java.util.Scanner;

public class Bronze_11720 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String sNum = scanner.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i=0; i<n; i++) {
            sum += cNum[i] - '0';
        }
        System.out.println(sum);
    }
}
