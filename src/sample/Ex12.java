package sample;

public class Ex12 {
    public static void main(String[] args) {

        try{
        int answer=10/0;
        System.out.println(answer);
        }catch(){
            System.out.println("0で割ることができません");
        }
    }

}
