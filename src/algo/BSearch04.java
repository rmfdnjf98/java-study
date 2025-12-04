package algo;

import java.util.Arrays;

//
public class BSearch04 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 0, 11}; // 정렬을 우선 해야하니 jre(lib) 사용하겠다

        // 1. 정렬 0,1,2,[3],4,10,11
        Arrays.sort(arr); //패키지명.___

        int target = 11;
        int i = 2;
        int mid = arr.length/i; //3

        //2. 검색

        for (int j = 0; j < 2; j++) {
            if(target == arr[mid]){ //0,1,2,[3],4,10,11
                System.out.println(target+"을(를) 찾았습니다.");
                return; // 복귀하면서 main q가 파괴되면서 끝난다 그래서 메인끝이 실행 되지 않는다 죽은 코드
            }

            if(target > arr[mid]){ //false
                mid = 5;
            }
            if(target < arr[mid]){
                mid = 1;
            }
            i++;
            i++;
        }

        System.out.println("main끝");
    }
}
