package ex06.ch01;

public class MyHash02 {
    public static void main(String[] args) {
        char c = 'A'; //  기본 자료형 char 문자 하나를 저장 홑따옴표,  2byte
        System.out.println(c);
        byte b =(byte) c;
        System.out.println(b);

        byte b1 = 65;
        char c1 = (char)b1; //타입이 다른거라 캐스팅 해야함
        System.out.println(c1);
    }
}
