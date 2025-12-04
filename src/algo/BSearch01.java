package algo;

import java.util.Arrays; // 남의것을 쓸때는 import가 앞에 붙는다.

// 10 찾기
public class BSearch01 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3}; // 정렬을 우선 해야하니 jre(lib) 사용하겠다

        // 1. 정렬 {1,2,3,4,10}
        Arrays.sort(arr); //패키지명.___

        //2. 검색
        if(10 == arr[2]){
            System.out.println("10을(를) 찾았습니다.");
        }
        if(10 < arr[2]){ // false인 경우 else를 쓰면 값이 나온다.
            System.out.println("10는 작아요");

            if (10 == arr[1]){
                System.out.println("10를 찾았습니다.");
            }
        }else{
            System.out.println("10은 커요");

            if (10 == arr[3]){
                System.out.println("10을 찾았습니다.");
            }else{
                System.out.println("arr[4]번지에 10이 있습니다.");
            }
        }


        System.out.println("main끝");
    }
}
