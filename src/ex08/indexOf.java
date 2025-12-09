package ex08;

import javax.crypto.spec.PSource;
public class indexOf {
    public static void main(String[] args) {
        String s = "The cat id on thr table";
        int index = s.indexOf("table");

        if(index == -1){
            System.out.println("table은 없습니다.");
        } else {
            System.out.println("table의 위치: " + index);
        }
    }
}
