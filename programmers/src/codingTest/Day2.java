package codingTest;

/*
정수를 담고 있는 배열 arr의 평균값을 반환
arr은 길이 1 이상, 100 이하인 배열
arr의 원소는 10,000 이상 10,000 이하인 정수
 */

public class Day2 {
    public double solution(int[] arr){
        int sum = 0;
        double answer = 0;
        for(int i=0;i<arr.length;i++){
            sum +=arr[i];
        }
        answer = (double) sum / arr.length;
        return answer;
    }
}
