package algo;

public  class Gcd03 {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        int[] arr1 = new int[6]; // [1][2][3][6][0][0]
        int[] arr2 = new int[8]; // [1][2][4][8][0][0][0][0]

        //1. 6의 약수 채우기==========================================
        int n1 = 0;  // [1][][][][][]
        int k1 = 1;

        for (int i = 0; i < 6; i++) {
            if(a%k1 == 0) {
                arr1[n1] = k1;
                n1++;
            }
            k1++;
        }

        //2. 8의 약수 채우기==========================================
        int n2 = 0;
        int k2 = 1;
        for (int i = 0; i < 8; i++) {
            if(b%k2 == 0) {
                arr1[n2] = k2;
                n2++;
            }
            k2++;
        }

        //3. 최대공약수 구하기
        int result = 0;
        int c = 0;

        for (int i = 0; i < 4; i++) {
            if(arr1[c] == arr2[0]) result = arr1[c];
            if(arr1[c] == arr2[1]) result = arr1[c];
            if(arr1[c] == arr2[2]) result = arr1[c];
            if(arr1[c] == arr2[3]) result = arr1[c];
            c++;
        }
        System.out.println("최대공약수는 ="+ result);

        System.out.println("메인끝");

    } // end of main
}