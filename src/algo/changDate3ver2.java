package algo;

public class changDate3ver2 {
    public static void main(String[] args) {
        // Sort 정렬 (오름차순 1,2,3)
        int[] arr = {4,2,3,1};
        int temp;
        int a = 0;
        int b = 1;
        int row = arr.length -1;  //row 행ㅇ으로 칭할려고 몇행 실시

        //1회전 4가 마지막자리
            if (arr[a] > arr[b]){
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;

            }
            a++;
            b++;

            if (arr[a] > arr[b]){
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }
            a++;
            b++;
            if (arr[a] > arr[b]){
                temp = arr[a];
                arr[a] = arr[b];
                arr[b] = temp;
            }
            a++;
            b++;
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j]);
            }

            
    }
}
