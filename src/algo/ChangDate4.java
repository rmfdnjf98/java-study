package algo;

public class ChangDate4 {
    public static void main(String[] args) {
        int[] arr = {7,4,2,3,1,5,6};
        int temp;
        // 1회전
        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if (arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        if (arr[2] > arr[3]){
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }
        if (arr[3] > arr[4]){
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }
        if (arr[4] > arr[5]){
            temp = arr[4];
            arr[4] = arr[5];
            arr[5] = temp;
        }
        if (arr[5] > arr[6]){
            temp = arr[5];
            arr[5] = arr[6];
            arr[6] = temp;
        }
        //2회전
        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if (arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        if (arr[2] > arr[3]){
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }
        if (arr[3] > arr[4]){
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }
        if (arr[4] > arr[5]){
            temp = arr[4];
            arr[4] = arr[5];
            arr[5] = temp;
        }

        //3회전
        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if (arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        if (arr[2] > arr[3]){
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }
        if (arr[3] > arr[4]){
            temp = arr[3];
            arr[3] = arr[4];
            arr[4] = temp;
        }

        //4회전
        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if (arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        if (arr[2] > arr[3]){
            temp = arr[2];
            arr[2] = arr[3];
            arr[3] = temp;
        }
        //5회전
        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        if (arr[1] > arr[2]){
            temp = arr[1];
            arr[1] = arr[2];
            arr[2] = temp;
        }
        //6회전
        if (arr[0] > arr[1]) {
            temp = arr[0];
            arr[0] = arr[1];
            arr[1] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
