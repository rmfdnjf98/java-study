package ex06.ch01;

public class MyHash03 {
    public static void main(String[] args) {
        char[] arr = {'A', 'B', 'C'};

        int h =0;

        // 스탭1.문자를 숫자로 바꾼다
        int n = arr[0]; // n=65

        h = h * 31 + n; // h= 65
        System.out.println(n);

        //스탭2
        n = arr[1];  // n=66
        h = h*31 + n; // h= 2081

        //3
        n = arr[2]; // n=67
        h = h*31 + n;

        System.out.println(h);

    }
}
