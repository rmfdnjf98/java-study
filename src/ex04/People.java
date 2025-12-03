package ex04;

public class People {

    private String name;
    private int height;
    private int weight;


    People(String name, int height, int weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    // 상태변경
    public void 밥먹기(){
        weight = weight +2;
    }


    //상태확인
    public int getWeight(){
        return weight;
    }
}
