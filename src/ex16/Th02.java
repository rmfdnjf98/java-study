package ex16;


public class Th02 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("새로운 스레드 : "+i);
            }
        });
        t1.start(); //스레드 생성

        for (int i = 0; i < 10; i++) {
            System.out.println("main 스레드 : "+i);
        }
    }
}
