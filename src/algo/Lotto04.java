package algo;

import java.util.Random;

public class Lotto04 {
    public static void main(String[] args) {
        //1.준비
        Random rand = new Random();
        int[] arr = new int[6];

        //2.로또 번호 받기
        int n; // n 이라는 변수에 랜덤 숫자를 담을 것

        //2.1 첫번째 추첨 [9][][][][][]
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 9
            if (isSame) {
                arr[0] = n;  // n=9
                break;
            }
        }

        //2.2 두번째 추첨 [9][15][][][][]
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 9,15
            if (arr[0] == n) {
                isSame = true;
            }
            if (isSame) {
                arr[1] = n;  // n=15
                break;
            }
        } // n=15

        //2.3 세번째 추첨 [9][15][20][][][]
        while (true) {
            boolean isSame = false;  // 기본을 false로 정해서 다를때만 번지에 집어 넣는다.
            n = rand.nextInt(45) + 1; // <- 9,15,20
            if (arr[0] == n) {
                isSame = true;
            }
            if (arr[1] == n) {
                isSame = true;
            }
            if (isSame) {
                arr[2] = n;  // n=20
                break;
            }
        }

        //2.4 네번째 추첨 [9][15][20][30][][]
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 9,15,20,30
            if (arr[0] == n) {
                isSame = true;
            }
            if (arr[1] == n) {
                isSame = true;
            }
            if (arr[2] == n) {
                isSame = true;
            }
            if (isSame) {
                arr[3] = n;  // n=30
                break;
            }
        }

        //2.5 다섯번째 추첨 [9][15][20][30][40][]
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 9,15,20,30,40
            if (arr[0] == n) {
                isSame = true;
            }
            if (arr[1] == n) {
                isSame = true;
            }
            if (arr[2] == n) {
                isSame = true;
            }
            if (arr[3] == n) {
                isSame = true;
            }
            if (isSame) {
                arr[4] = n;  // n=40
                break;
            }
        }

        //2.6 여섯번째 추첨 [9][15][20][30][40][43]
        while (true) {
            boolean isSame = false;
            n = rand.nextInt(45) + 1; // <- 9,15,20,30,40,43
            if (arr[0] == n) {
                isSame = true;
            }
            if (arr[1] == n) {
                isSame = true;
            }
            if (arr[2] == n) {
                isSame = true;
            }
            if (arr[3] == n) {
                isSame = true;
            }
            if (arr[4] == n) {
                isSame = true;
            }
            if (isSame) {
                arr[5] = n;  // n=43
                break;
            }
        }

    }
}
