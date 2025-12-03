package ex04;

import org.w3c.dom.ls.LSOutput;

public class Ex {

    boolean status = false;

    void on(){
        System.out.println("tv가 켜졌어요");
        status = true;
    }

    void off(){
        System.out.println("tv가 꺼졌어요");
        status = false;
    }

    public static void main(String[] args) {
        Ex tv = new Ex();
        System.out.println(tv.status);
    }

}
