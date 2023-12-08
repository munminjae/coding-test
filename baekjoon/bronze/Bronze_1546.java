package baekjoon.bronze;

import java.util.Scanner;

public class Bronze_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int scoreList[] = new int[number];
        for(int i=0; i<number; i++) {
            scoreList[i] = scanner.nextInt();
        }
        long sum = 0;
        long max = 0;
        for(int i=0; i<number; i++) {
            if(scoreList[i]>max) {
                max = scoreList[i];
            }
            sum += scoreList[i];
        }
        System.out.println(sum*100/max/number);
    }
}