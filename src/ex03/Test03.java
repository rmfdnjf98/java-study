package ex03;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        int sum = 0;
        //처음 작성할 때
        // 누적 (sum++, sum = sum+1)
        // sum = sum+1;
        // sum = sum+2; 계속 누적

       //다음 과정
       // int i = 0;
       // i++
       // sum = sum+i;
       // i++
       // sum = sum+i;  계속 반복  -> 해결은 됬지만 만약 10이 아니라 그이상의 숫자일 경우나 요구 사항이 달라질때 힘들다.

       //다음 과정 for문 i++계속 쓰는것보다 for문으로 알면 바로 활용해도 괜찮다.
       // int sum = 0; , int i = 0;
       //for (int j = 0; j < 21; i++)
       //i++;  (밖에ㅔ int i = 0이 있지만 for문 안에서 i++들어가도 괜찮다.)
       //sum = sum + i;

       //결과1
        for (int i = 0; i < 11; i++) {
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
       //결과 2
       // int sum = 0; , int n = 10;
       //     sum = (n+1)(n/2);
       // sout(sum)
