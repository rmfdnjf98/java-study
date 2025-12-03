package ex04;

public class Box{
    int width, height, depth;
    public Box(int w, int h, int d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    @Override //alt + insert -> toString
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                ", depth=" + depth +
                '}';
    }

    public static void main(String[] args) {
        Box i = new Box(10,20,30);
        System.out.println("박스는 " + i.width);
        System.out.println("박스는 " + i.height);
        System.out.println("박스는 " + i.depth);
        System.out.println(i);
    }
}
