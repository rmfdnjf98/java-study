package ex07;

abstract class 판사{ //추상클래스
    // 구체적인 행위가 오브젝트마다 다를 때!!!
    public abstract void 심문(); // 추상메서드, 추상이라 틀만 있으면 되니 뒤에 몸체 중괄호 없애기 가능, // 같은 행위 안에 구체적인게 달라서 부모에게 끌어올리고 추상화(추상화)
    public void 종료(){
        System.out.println("심문을 종료한다.");
    }
}
class 왕 extends 판사{ //판사 is 왕
    public void 심문(){ 
        System.out.println("왕은 심문한다.");
    }
}
class 왕비 extends 판사{ //판사 is 왕비
    public void 심문(){
        System.out.println("왕비는 심문한다."); // 왕과 왕비 구체적인 행위가 다르다
    }
}
abstract class 증인 {
    public abstract void 대답();
}
class 모자장수 extends 증인{
    public void 대답(){
        System.out.println("모장장수는 대답한다.");
    }
}
class 엘리스 extends 증인{
    public void 대답(){
        System.out.println("엘리스는 대답한다.");
    }
}

public class AliceApp {
    public static void main(String[] args) {
        //1.초기화
        증인 c1 = new 모자장수();
        증인 c2 = new 엘리스();
        판사 c3 = new 왕();
        판사 c4 = new 왕비();

        c1.대답();
        c2.대답();

        c3.심문();
        c3.종료();

        c4.심문();
        c4.종료();
    }
}
