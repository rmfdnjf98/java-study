package ex06.ch01.game;

public class GameApp {

    // u1 -> u2를 공격
    static void start(Protoss u1, Protoss u2) { //
        // u2.hp = u2.hp - u1.attack;
        int remainHp = u2.getHp() - u1.getAttack();
        u2.setHp(remainHp);
    }
    public static void main(String[] args) {
        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot();
        Dragoon d1 = new Dragoon();

        // 1. 드라군의 상태확인
        start(z1, d1);
        System.out.println(d1.getHp());

        // 2. 질럿의 상태확인
        start(d1, z1);
        System.out.println(z1.getHp());

        start(z1, z2);
        System.out.println(z2.getHp());

        System.out.println();
        System.out.println(1);
        System.out.println("");
        System.out.println(1.2);
        System.out.println(true);

    }
}
