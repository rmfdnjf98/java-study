package ex13;
// new 할깨 타입을 결정할 수 있게 해주는 제너릭
class Box2<T>{ // T 타입 결정 안남 new 할 때 결정남
    T data;
}
public class Ge02 {
    public static void main(String[] args) {
        Box2<String> box2 = new Box2(); // 타입 결정 남
        //box2.data = 1; // new에서 String으로 결정 해서 무조건 오류
        box2.data = "안녕";
        int len = box2.data.length();
        System.out.println(len);

        Box2<Integer> box3 = new Box2(); // 래퍼클래스 int
        box3.data = 5;
        System.out.println(box3.data);
    }
}
