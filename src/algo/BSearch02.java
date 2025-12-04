package algo;

import java.util.Arrays;

// 4 찾기
public class BSearch02 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 8, 6}; // 정렬을 우선 해야하니 jre(lib) 사용하겠다

        // 1. 정렬 {0,1,2,3,4,6,8,10}
        Arrays.sort(arr); //패키지명.___

        int target = 4;
        int mid = arr.length/2;

        //2. 검색 1,2,3,4,6,8,10
        if(target == arr[mid]){
            System.out.println(target+"을(를) 찾았습니다.");
        }
        if(target < arr[mid]){ // false인 경우 else를 쓰면 값이 나온다.
            System.out.println(target+"는 작아요");

            if (target == arr[1]){
                System.out.println(target+"를 찾았습니다.");
            }
        }else{
            System.out.println(target+"은 커요");

            if (target == arr[3]){
                System.out.println(target+"을 찾았습니다.");
            }else{
                System.out.println("arr[4]번지에 "+ target +"이 있습니다.");
            }
        }


        System.out.println("main끝");
    }
}
