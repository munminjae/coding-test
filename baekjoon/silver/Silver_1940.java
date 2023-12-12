import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//투포인터 문제
//배열을 정렬 후 맨 앞과 맨 뒤를 시작 인덱스로 잡는다.
public class Silver_1940 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        int count = 0;
        int start_index = 0;
        int end_index = N-1;

        while (start_index<end_index) {
            if(A[start_index]+A[end_index]<M) {
                start_index++;
            } else if(A[start_index]+A[end_index]>M) {
                end_index--;
            } else {
                count++;
                start_index++;
                end_index--;
            }
        }
        System.out.println(count);

    }
}