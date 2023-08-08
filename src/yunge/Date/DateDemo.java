package yunge.Date;

import java.util.Date;

/**
 * 测试Date对象的创建
 */
public class DateDemo {
    public static void main(String[] argps) {
             test1();
    }
    /**
     * 测试Date对象的创建
     */
    public static void  test1(){
        Date date = new Date();
        System.out.println(date);

        Date date2 = new Date(date.getTime());
        System.out.println(date2);
        //获取日期对象中的年份
        int year = date.getYear()+1900;
        System.out.println(year);
        //获取月份
        int month = date.getMonth()+1;
        System.out.println(month);
        //获取天
        int day = date.getDate();
        System.out.println(day);
        //获取周几
        int wenkday = date.getDay();
        System.out.println(wenkday);

        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getSeconds());

        System.out.println(year+"年"+month+"月"+day+"日"+date.getHours()+"时"+date.getMinutes()+"分"+date.getSeconds()+"秒"+",星期"+wenkday);

        System.out.println("检测当前日期是否在指定日期之后");
        Date date1 = new Date(1000l * 60 * 60 * 24 * 365 * 8);//1970年再过八年后的日期
        boolean after = date.after(date1);
        System.out.println(after);

        System.out.println("检测当前日期是否在指定日期之后");
        boolean before = date.before(date1);
        System.out.println(before);


        System.out.println("检测当前日期是否和指定日期相等");
        System.out.println(date.equals(date2));


        System.out.println("比较两个日期 0相同  小于0 则当前日期在指定日期之前  大于0 则当前日期在指定日期之后");
        System.out.println(date.compareTo(date2)+"相等");
        System.out.println(date.compareTo(date1)+"date比date1晚");
        System.out.println(date1.compareTo(date)+"date1比date早");

        System.out.println("获取毫秒值");
        System.out.println(date.getTime());

    }



}
