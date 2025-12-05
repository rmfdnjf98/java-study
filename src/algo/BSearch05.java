package algo;


import java.util.Arrays;

public class BSearch05 {

    public static void main(String[] args) {

        int[] arr = {0,1,2,9,8,7,6,5,4,3,10};  // 11개 log11 -> 3~4회안에 끝남

        Arrays.sort(arr); // {0,1,2,3,4,5,6,7,8,9,10}

        int target = 6;
        int startIndex = 0;
        int endIndex = 10;
        int mid = (endIndex - startIndex) / 2;

        if (target == arr[mid]) {  // {0,1,2,3,4,[5],6,7,8,9,10}
            System.out.println(target + "을 찾았습니다(1라운드): " + arr[mid]);
        }

        startIndex = mid + 1 ; // 5+1= 6번지
        mid = (endIndex - startIndex) / 2 + startIndex; // 8번지
        if (target == arr[mid]) {  // {0,1,2,3,4,5,6,7,[8],9,10}
            System.out.println(target + "을 찾았습니다(2라운드): " + arr[mid]);
        }


        endIndex = mid - 1; //8-1=7
        mid = (endIndex - startIndex) / 2 + startIndex; //
        if (target == arr[mid]) {  // {0,1,2,3,4,5,6,7,8,9,10}
            System.out.println(target + "을 찾았습니다(2라운드): " + arr[mid]);
        }
    }
}
