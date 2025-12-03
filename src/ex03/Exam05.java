package ex03;

public class Exam05 {
    public static void main(String[] args) {
        // 3행!! 2sp, 1star
        // 4행!! 3sp, 1star
        // 5행!! 4sp, 1star
        // 반복하니 star는 항상 1이라는 사실과 sp는 행-1발견


        String space = " ";
        String star = "*";
        int row = 3;
        int n1 = row-1; //변수 두개를 만들어 주자
        int n2 = 1;

        for (int k = 0; k < row; k++) {
            for (int i = 0; i < n1; i++) {
                System.out.print(space);
            }
            for (int i = 0; i < n2; i++) {
                System.out.print(star);
            }
            System.out.println();
            n1--;
            n2++;
        }

    }

}




