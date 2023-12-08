package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_11659 {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int dataCount = Integer.parseInt(stringTokenizer.nextToken());
        int questionCount = Integer.parseInt(stringTokenizer.nextToken());
        int[] sumList = new int [dataCount+1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int sum = 0;
        for(int i=1; i<=dataCount; i++) {
            sumList[i] = sumList[i-1] + Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sumList[i]);
        }

        for(int i=0; i<questionCount; i++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int startSection = Integer.parseInt(stringTokenizer.nextToken());
            int endSection = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sumList[endSection] - sumList[startSection-1]);
        }
	}
}
