package ex13;

/**
 * Object 로 설계할 수 밖에 없는 이유
 */

// 싱글톤 패턴
class 서랍 { //미리 떠있어야 해서 다른 사람 라이브러리에서 가져옴 -> 이 라이브러리 만든 사람 입장에서는 미리 뜨게 해둠

    Object data;

    public static 서랍 Instance = new 서랍();

    private 서랍() {
    }
}
public class Ge03 {
    public static void main(String[] args) {
        서랍 s = 서랍.Instance;
        s.data = "안녕";

        //다운캐스팅
        String castData = (String)s.data;
        int len = castData.length();
        System.out.println(len);
    }
}
