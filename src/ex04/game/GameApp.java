package ex04.game;

class Protoss {

}






public class GameApp {

    // u1 -> u2를 공격
    static void start(Zealot u1, Dragoon u2){
        u2.hp = u2.hp - u1.attack;
    }

    static void start(Dragoon u1, Zealot u2){ // 변수 이름이 같아도 변수 위치가 달라지면 다른게 인식해준다 오버로드
        u2.hp = u2.hp - u1.attack;
    }

    static void start(Zealot u1, Zealot u2){ // 변수 위치가 달라지면 다른게 인식해준다 오버로드
        u2.hp = u2.hp - u1.attack;
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot();
        Dragoon d1 = new Dragoon();

        start(z1, d1);

        // 1. 드라군의 상태확인
        System.out.println(d1.hp);

        // 2. 질럿의 상태확인
        start(d1, z1);
        System.out.println(z1.hp);

        start(z1, z2);
        System.out.println(z2.hp);

        System.out.println();
        System.out.println(1);
        System.out.println("");
        System.out.println(1.2);
        System.out.println(true);

  }
}
