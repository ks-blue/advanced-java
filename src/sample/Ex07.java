package sample;
import java.time.LocalDate;

public class Ex07 {
    public static void main(String[] args) {
        LocalDate localDate=LocalDate.of(1997,5,8);
        int year=localDate.getYear();
        int month=localDate.getMonth();
        int dayOfMonth=localDate.getDayOfMonth();

        System.out.println("私の誕生日は"+year+"年"+month+"月"+dayOfMonth +"です");
    }

}
