package algo;

public class ChangDate3 {
    public static void main(String[] args) {
        // Sort 정렬 (오름차순 1,2,3)
        int[] arr = {2,3,1};
        int temp;

        //0,1번지 비교 -> 참 -> 스왑 {2,3,1}
        temp = arr[0];
        arr[0] = arr[0];
        arr[1] = arr[1];

        //1,2번지 비교 -> 참 -> 스왑 {2,1,3}
        temp = arr[1]; //231
        arr[1] = arr[2];   //213
        arr[2] = temp;     //213

        //0,1번지 비교 -> 참 -> 스왑 {1,2,3}
        temp = arr[1];   //213
        arr[1] = arr[0]; //123
        arr[0] = temp;   //123

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}
