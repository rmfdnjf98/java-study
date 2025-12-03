package ex03;


import org.w3c.dom.ls.LSOutput;

public class Test04 {
    public static void main(String[] args) {

// *****
// ****
// ***
// **
// *
        String star ="*";
        int c = 5;// c가 증가 됨에 따라 줄이 생기니 이걸 for문화 시키자
        int row = 5;

        for (int k = 0; k < row; k++) {
            for (int i = 0; i < c; i++) {
                System.out.print(star);
            }
            System.out.println();
            c--;

        }

    }
}
