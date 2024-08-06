package codingTest;

/*
파라미터로 받은 자연수 n을 뒤집어 배열로 만들기

n은 1에서 10,000,000,000이하인 자연수
*/

public class Day1 {
    public int[] solution(long n){
        String s = String.valueOf(n);
        int[] answer = new int[s.length()];

        for(int i=0;i<answer.length;i++){
            answer[i] = Integer.parseInt(s.substring(answer.length-1-i, answer.length-i));
        }
        return answer;
    }
}
