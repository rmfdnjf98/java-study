
package algo;

/**
 * 12의 약수를 출력하시오
 * (1) 비즈니스 이해 (12를 1부터12까지 나누어 떨어지면 약수)
 * (2) 샘플링 6의 약수 구하기
 * (3) 노가다
 * (4) 패턴 찾기
 */
public class Divisor01 {
    public static void main(String[] args) {
        int n = 1;
        String result = "맞음";

        for (int i = 0; i < 12; i++) {
            if (12%n == 0){
                result = "맞음";
            }else {
                result = "아님";
            }
            // n=1~12
            System.out.println(n+"은(는) 약수 "+ result);
            n++;
        }
    }
}