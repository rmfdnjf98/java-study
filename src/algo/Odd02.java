package algo;

/**
 *  1-100까지
 */
public class Odd02 {
    public static void main(String[] args) {

        int num = 1;
        String result = "홀수";

        for (int i = 0; i < 100; i++) {
        //num = 1~100
        if(num%2 == 0){ //false
            result = "짝수";
        }else {
            result = "홀수";
        }

        System.out.println(num + "은 "+result+"입니다.");
        num++;
        }
    }
}
