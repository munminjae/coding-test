import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length; i++) {
            if(i!=numbers.length-1) {
                for(int j=i+1; j<numbers.length; j++) {
                    int result = 0;
                    result = numbers[i] + numbers[j];
                    if(numberList.size()>0) {
                        boolean check = true;
                        for(int k = 0; k<numberList.size(); k++) {
                            if(numberList.get(k)==result) {
                                check = false;
                            }
                        }    
                        if(check) {
                            numberList.add(result);
                        }
                    } else {
                        numberList.add(result);
                    }
                }   
            }
        }
        ArrayList<Integer> numberList2 = new ArrayList<Integer>();
        //배열의 정렬
        //Arrays.sort(numberList);
        //리스트 정렬
        Collections.sort(numberList);
        int[] answer = new int[numberList.size()];
        for(int x =0; x<answer.length; x++) {
            answer[x] = numberList.get(x);
        }
        return answer;
    }
}