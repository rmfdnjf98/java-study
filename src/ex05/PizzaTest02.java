package ex05;

public class PizzaTest02 {
    public static void main(String[] args) {
        Pizza02 p1 = new Pizza02("super Supreme");
        Pizza02 p2 = new Pizza02("cheese");
        Pizza02 p3 = new Pizza02("pepperoni");
        int n = Pizza02.count;
        System.out.println("지금까지 판매된 피자 개수 = "+ n);
    }
}
