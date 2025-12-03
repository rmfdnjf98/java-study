package algo;

public class ChangDate2 {
    public static void main(String[] args) {
        //  {1,2,3,4,5,6,7} --> {7,6,5,4,3,2,1}
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n1 = 9;
        int n2 = 0;
        int temp;

        for (int j = 0; j < 1; j++) {
            //4. arr[3]번지와 arr[3]번지 스왑 --> 교환번지 동일할 때 종료
            temp = arr[n1];// temp=7  {1234567}
            arr[n1] = arr[n2];  // temp=7  {1234321}
            arr[n2] = temp;    // temp=7  {7654361}
            n1--;
            n2++;

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
        }


        }
    }
}
