package example;


class Shape{
    void draw(){
        //System.out.println("도형을 그립니다.");
    }
}

class Circle extends Shape{
    //String draw = "원을 그립니다.";
    void draw(){
        System.out.println("원을 그립니다.");
    }
}
class Rectangle extends Shape{
    //String draw = "사각형을 그립니다.";
    void draw(){
        System.out.println("사각형을 그립니다.");
    }
}
class Triangle extends Shape{
    //String draw = "삼각형을 그립니다.";
    void draw(){
        System.out.println("삼각형을 그립니다.");
    }
}

public class ShapeApp {
    public static void main(String[] args) {
       Shape[] shapes = new Shape[3];
       Shape s1 = new Circle();
       Shape s2 = new Rectangle();
       Shape s3 = new Triangle();

       shapes[0] = s1;
       shapes[1] = s2;
       shapes[2] = s3;

       for (Shape ss : shapes){
            ss.draw();
       }
    }
}
