package ex02;

import java.util.Scanner;

public class CalTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("초를 입력하시오:");
        int time = sc.nextInt(); // 키보드 입력 대기
        int sec = time%60; // 100을 60으로 나눈 나머지 = 40초
        int min = time/60; // 100을 60으로 나눈 정수 = 1분
        System.out.println(time + " 초는 " + min + " 분" +sec+ " 초입니다." );

    }

}