
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo1 {
    public static void main(String[] args) throws ParseException {
        // 1.日期对象
        Date d = new Date();
        System.out.println(d);
        
        // 2.格式化这个日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss EEE a");

        // 3.开始格式化日期对象（指定最终格式化的形式）
        String rs = sdf.format(d);
        System.out.println(rs);

        // 4.格式化时间毫秒值
        // 需求，请问121秒后的时间是多少
        long time1 = System.currentTimeMillis() + 121 *1000;
        String rs2 = sdf.format(time1);
        System.out.println(rs2);

        System.out.println("----------------------------");

        // 目标：学会使用SimpleDateFormat解析字符串时间成为日期对象
        // 有一个时间 2021年8月6日 11：11：11 往后 2天 14小时 49分 06秒的时间是多少

        // 1.把字符串时间拿到程序中来
        String dateStr = "2021年08月06日 11:11:11";

        // 2.把字符串时间解析成日期对象
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date parse = sdf2.parse(dateStr);

        // 3.往后走 2天 14小时 49分 06秒
        long time = parse.getTime() + (2L * 24 * 60 * 60 + 14 * 60 * 60 + 49 * 60 + 6) * 1000;

        // 4.格式化这个时间的毫秒值
        System.out.println(sdf2.format(time));
    }
}
