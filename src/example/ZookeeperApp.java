package example;

class Animal {
    void introduce() {
    }
    void sound() {
    }
    void act() {
    }
}

class Dog extends Animal{
    String name = "콩이";
    String sound = "멍멍!";
    String act = "꼬리를 흔든다";

    void introduce(){
        System.out.println("제 이름은 "+ name + " 입니다.");
    }
    void sound() {
        System.out.println(sound);
    }
    void act(){
        System.out.println(act);
    }
}

class Cat extends Animal{
    String name = "나비";
    String sound = "야옹~";
    String act = "할퀸다";

    void introduce(){
        System.out.println("제 이름은 "+ name + " 입니다.");
    }
    void sound() {
        System.out.println(sound);
    }
    void act(){
        System.out.println(act);
    }
}

class Duck extends Animal{
    String name = "덕돌이";
    String sound = "꽥꽥!";
    String act = "헤엄친다";


    void introduce(){
        System.out.println("제 이름은 "+ name + " 입니다.");
    }
    void sound() {
        System.out.println(sound);
    }
    void act(){
        System.out.println(act);
    }
}

class Zookeeper {
    static void action(Animal a){
        a.introduce();
        a.sound();
        a.act();
    }
}

public class ZookeeperApp {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Duck();

        animals[0] = a1;
        animals[1] = a2;
        animals[2] = a3;

        //Zookeeper z = new Zookeeper();

        for (Animal a : animals) {
            Zookeeper.action(a);
        }
    }
}
