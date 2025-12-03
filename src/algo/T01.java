package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오
 * (1) 비즈니스 1이 2의 배수 인가요? ,2는 2의 배수인가요?
 * (2) 샘플링  5개 해보자
 * (3) 노가다
 * (4) 패턴
 */
public class T01 {
    public static void main(String[] args) {
        int n = 1;
        String result = "아닙니다.";

        for (int i = 0; i < 100; i++) {
            // 1일때 ~100때
            if (n%2 == 0){
                result = "맞습니다.";
            }else {
                result = "아닙니다.";
            }
            System.out.println(n+"은(는) 2의 배수가 "+result);
            n++;
        }
    }
}
