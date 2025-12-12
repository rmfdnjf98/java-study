package ex16;

class Hello implements Runnable{ //메서드 이름의 규칙 -> run이라는 메서드를 찾게 설정되있다, 행위를 강제
    //sub 스레드
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("sub스레드: " +i);
        }
        System.out.println("sub스레드 종료");
    }
}

public class Th01 {
    //main 스레드
    public static void main(String[] args) {
        System.out.println("첫번째실행");
        System.out.println("두번째실행");
        System.out.println("세번째실행");
        Hello hello = new Hello();
        Thread sub = new Thread(hello);
        sub.start(); // run 메서드가 새로운 작업단위가 된다. 이제 동시적으로 된다
        for (int i = 0; i < 100; i++) {
            System.out.println("main 스레드: " +i);
        }
        System.out.println("main 스레드 종료");
    }
}
