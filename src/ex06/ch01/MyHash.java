package ex06.ch01;

class Data extends Object{ //안적어도 extends Object 가 적혀있는거

    int num;

    public Data(int num) {
        this.num = num;
    }

    @Override
    public int hashCode(){
        return super.hashCode(); // super은 부모의 주소를 말한다. this는 자신의 주소를 말하는거 처럼
    }
}
public class MyHash extends Object{
    public static void main(String[] args) {
        Data d1 = new Data(1); // d1,d2 상태는 같으나 메모리 주소(공간)는 다르다
        Data d2 = new Data(1);
        Data d3 = d1; // 얕은 복사(주소만 복사)  // 해시코드가 같다는 소리

        System.out.println(d1.hashCode()); // d1,d2 주소가 다르다->안의 값을 비교해야 같은 개체인지 확인 가능
        System.out.println(d2.hashCode());

        if(d1.hashCode() == d2.hashCode()){ // 주소 먼저 비교하면 좋고 같다면 값이 같을것, 주소가 달라도 상태가 같을 수 있다
            System.out.println("같은 주소에 있믐 객체");
        }else {
            System.out.println("다른 주소에 있는 객체");
        }

        if(d1.num == d2.num){ // 상태를 같지만 주소는 다른 상태를 비교
            System.out.println("값이 같습니다.");
        }else{
            System.out.println("값이 다릅니다.");
        }

        if (d1.hashCode() == d3.hashCode()){ // 얕은 복사라 주소만 같은 경우를 비교 값이 같다.
            System.out.println("같아요! 얕은복사 됐어요");
        }else{
            System.out.println("달라요! new가 된 다른 주소 같아요");
        }
    }
}
