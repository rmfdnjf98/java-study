package ex06.ch01;

import java.util.HashMap;

public class MyHash04 {
    public static void main(String[] args) {
        HashMap<String, String> arr = new HashMap(); // 찾는키
        arr.put("age", "1"); //크기가 1인 배열이 만들어짐 1로 나눈 나머지로 구해
        arr.put("name", "임꺽정"); // key, value


        // 찾을때 // name을 해시해서 그 키 값을 나눈 나머지를 배열로 넣고 그걸 이용해서 찾아서 출력
        System.out.println(arr.get("name")); // name이라는 주소에 value를 찾을 수 있다
    }
}
