package ex06.ch01;

public class MyHash05 {
    public static void main(String[] args) {
        String[] arr = new String[3];
        String n1 = "홍길동";
        String n2 = "임꺽정";

        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());

        int indexN1 = n1.hashCode() % 3;
        int indexN2 = n1.hashCode() % 3;

        System.out.println(indexN1);
        System.out.println(indexN2);

        arr[indexN1] = n1;
        arr[indexN2] = n2;
    }
}
