package ex04;

// OOP : Object Oriented Programing
// 1원칙 : 상태는 행위를 통해 변경한다.
//
public class PeopleApp {
    public static void main(String[] args) {
        People people1 = new People("홍길동", 30, 5);
        People people2 = new People("장보고", 20, 3);


        people1.밥먹기();//메서드(상태변경)
        people1.밥먹기();//메서드(상태변경) --> 행위 두번하면 두번 상태 두번 바뀐다
        System.out.println(people1.getWeight());

    }
}