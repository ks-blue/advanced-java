package sample;

public class DateTimeSample2 {
    public static void main(String[] args) {
        LocalDeteTime localDatetime=LocalDateTIme.of(2018,1,2,3,4,5,999999);
        System.out.println("日付と時間："+localDateTime);

        int year = localDateTime.getYear();
        System.out.println("年:" + year);
        int month = localDateTime.getMonthValue();
        System.out.println("月:" + month);

    }

}
