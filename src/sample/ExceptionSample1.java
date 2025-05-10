package sample;

public class ExceptionSample1 {
    public static void main(String[] args) {
        System.out.println("プログラム開発");

        int answer=caic(10,0);
        System.out.println(answer);

        System.out.println("プログラム終了");


    }

    public static int calc(int num1, int num2) {
        return num1 / num2;
    } 

}
