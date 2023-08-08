package yunge.Calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarDemo {
    public static void main(String[] args) {
        //创建日历对象
        Calendar calendar = Calendar.getInstance();
        System.out.println("********"+calendar);//默认为当前系统时间
        System.out.println("**********************功能********************");
        System.out.println("根据Date日期设置日历对象");
        Date date = new Date(1000l * 60 * 60 * 24 * 365 * 5);
        calendar.setTime(date);
        System.out.println(calendar);

        System.out.println("日历对象转Date");
        Date time = calendar.getTime();
        System.out.println(time);


        System.out.println("设置日历中的年月日");
        calendar.set(2023,6,12);//手动设置日期时间
        System.out.println(calendar);
        Date time1 = calendar.getTime();
        Date date1 = new Date();
        System.out.println(date1.getTime()/1000/60/60/24);
        System.out.println(time1.getTime()/1000/60/60/24);
        long l = date1.getTime() - time1.getTime();
        System.out.println(l/1000/60/60/24);
        System.out.println("获取日历对象中的日期信息");
        System.out.println(calendar.YEAR);//获取年的编号
        System.out.println(calendar.get(calendar.YEAR));
        System.out.println(calendar.get(calendar.MONTH));
        System.out.println(calendar.get(calendar.DATE));


    }
}
