package ex02;

public class FtoC {
    public static void main(String[] args) {
        // 1. 화씨온도 받기(캐나다에서 쓰는 온도 F)
        double f = 100.0;
        //System.out.println(f);  /참

        // 2. 섭씨온도로 변경하기
        double c = 5.0/9 * (f-32);
        //System.out.println(f-32); /참
        //System.out.println(5/9); // int공간에 int 나누면 0.몇(실수)이 아니라 0(정수)
        //0 * 0.68 = 0.0
        //System.out.println(5/9.0); //int 나누기 double이면 double값이 나온다


        // 3. 출력해서 섭씨온도 확인하기(37.7777) / 검증단계
        System.out.println("섭씨온도는 "+c);

    }
}