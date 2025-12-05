package ex06.ch01;


class 재판관 {}
class 진행자{}
class 죄인 {}


class 왕 extends 재판관{

}
class 왕비 extends 재판관{

}
class 토끼 extends 진행자{

}
class 모자장수 extends 죄인{

}

public class ex01 {
    public static void main(String[] args) {
        죄인 u1 = new 모자장수(); // [죄인, 모자장수] --> 메모리가 같이 뜬다
        //토끼 u2 = new 진행자(); // [진행자]
        재판관 u3 = new 왕비(); // [왕비, 재판관]
    }
}
