public class Practice {
    /*
        매개변수 2개가 주어짐 day와 k
        day는 1월 1일이 무슨 요일인지 주어지고 k는 기준일
        각 요일의 값
        월 0
        화 1
        수 2
        목 3
        금 4
        토 5
        일 6
        1월부터 12월까지 일 수
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31

        1월부터 12월까지 기준일이 주말이면 1, 평일이면 0을 출력한다.
    */
    public int[] solution(int day, int k) {
        int[] answer = new int[12];
        for(int i=1; i<=12; i++) {
            int monthFirstDay = getFirstDay(day, i);
            monthFirstDay += (k-1);
            monthFirstDay %= 7;
            if(monthFirstDay>4) {
                answer[i-1] = 1;
            } else {
                answer[i-1] = 0;
            }
        }
        return answer;
    }

    public  int getFirstDay(int newYearDay, int month) {
        int[] maxDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int firstDay = newYearDay;
        for(int i=0; i<(month-1); i++) {
            firstDay += maxDay[i];
        }
        firstDay %= 7;
        return firstDay;
    }
}
