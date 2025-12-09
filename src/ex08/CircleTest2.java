package ex08;

class Circle2{
    int radius;
    public Circle2(int radius) {
        this.radius = radius;
    }
}
public class CircleTest2 {
    public static void main(String[] args) {
        Circle2 obj1 = new Circle2(10);
        Circle2 obj2 = new Circle2(10);
        if(obj1 == obj2) System.out.println("2개의 원은 같습니다.");
        else System.out.println("2개의 원은 같지 않습니다.");
    }
}
