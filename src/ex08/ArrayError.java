package ex08;

public class ArrayError {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int i = 0;

        try{
            for (int j = 0; j <= array.length; j++)
                System.out.print(array[j]+ " ");
        }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("인덱스 "+i+"는 실행할 수 없네요!");
        }
    }
}
