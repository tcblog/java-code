import java.time.LocalDateTime;

public class Demo01LocalDate {
    public static void main(String[] args) {
        // 1.获取本地日期对象
        LocalDateTime nowDate = LocalDateTime.now();
        System.out.println(nowDate);

        int year = nowDate.getYear();
        System.out.println(year);

        int month = nowDate.getMonthValue();
        System.out.println(month);

        int day = nowDate.getDayOfMonth();
        System.out.println(day);

        int dayOfYer = nowDate.getDayOfYear();
        System.out.println(dayOfYer);

        System.out.println(nowDate.getDayOfWeek());
        System.out.println(nowDate.getDayOfWeek().getValue());

        System.out.println(nowDate.getMonth());
        System.out.println(nowDate.getMonth().getValue());
    }
}
