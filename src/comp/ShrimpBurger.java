package comp;

public class ShrimpBurger extends Burger{ //버거에 생성자를 만들어 둔 상태라 오류 뜨므로 생성자 만들어 줘야 한다
    private String material; // 재료 (새우)

    public ShrimpBurger(String name, int price, String material) {
        super(name, price);  //부모에게 있는 상태를 사용한다.
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
