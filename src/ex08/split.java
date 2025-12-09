package ex08;

public class split {
    public static void main(String[] args) {
        String[] tokens = "I am a boy.".split(" ");
        for (String token : tokens) {
            System.out.println(token);
        }

        String[] tokenss = "100,200,300".split(",");
        for (String token : tokenss){
            System.out.println(token);
        }
    }
}
