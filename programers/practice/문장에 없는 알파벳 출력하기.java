package programers.practice;

import java.util.*;

class Solution {
    public String solution(String sentence) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String answer = "";
        sentence = sentence.toLowerCase();
        List<String> resultList = new ArrayList<String>();
        for(char sentenceC : alphabet.toCharArray()) {
            if(sentence.indexOf(sentenceC)==-1) {
                answer += Character.toString(sentenceC);
            }
        }
        if(answer.equals("")) {
            answer = "perfect";
        }
        return answer;
    }
}
