package ex06.ch01.game;

public class River extends Protoss {
    private int hp = 100;
    private int attack = 10;

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
