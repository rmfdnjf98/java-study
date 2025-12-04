package ex04;

public class Burger {

    String 재료1;
    String 재료2;
    String 재료3;
    int price;

    // 기본생성자
    Burger(){
        재료1 = "불고기";
        재료2 = "양상추";
        재료3 = "빵";
        price = 3800;
    }

    Burger(String 재료1, int price){
        this.재료1 = 재료1;
        재료2 = "양상추";
        재료3 = "빵";
        this.price = price;
    }

    Burger(String 재료1, String 재료2, int price){
        this.재료1 = 재료1;
        this.재료2 = 재료2;
        재료3 = "빵";
        this.price = price;

    }

    void 재료표기(){
        System.out.println(재료1 + 재료2 + 재료3 + " 가격은 " + price);
    }


    public static void main(String[] args) {
        Burger b1 = new Burger();
        Burger b7 = new Burger("새우", 4000);
        System.out.println(b7.재료1 + b7.재료2 + b7.재료3 + b7.price);
        Burger b8 = new Burger("한우불고기", 8000);
        Burger b9 = new Burger("베이컨", "토마토", 7000);

        b8.재료표기();


    }
}