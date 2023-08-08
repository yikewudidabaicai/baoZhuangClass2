package yunge.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class simpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        test();
    }

    /**
     * simpleDateFormat测试
     */
    public static void test() throws ParseException {
        System.out.println("*********************日期格式化操作**************************");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();//无参构造
        /**
         * 有参构造 参数为 用来指定格式的字符串
         * 默认模板为
         * 年 yyyy
         * 月 MM
         * 日 dd
         *
         *
         **/
        String f = "yyyy年MM月dd日";
        System.out.println("日期模板为 yyyy年MM月dd日");
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat(f);
        System.out.println("传入一个Date对象 将该对象的时间按以上格式返回为字符串");
        String format = simpleDateFormat1.format(new Date());//Date转String
        System.out.println(format);


        System.out.println("*****************日期文本的解析*即*（把文本转换成Date类型）**************************");
        String strDate = "2018.8.8";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy.MM.dd");
        Date parseDate = sdf1.parse(strDate);////String转Date需抛出异常
        System.out.println(parseDate);


        System.out.println("调用自己提供的工具类");
        System.out.println("按格式解析");
        Date date = DateUtil.pareDateText("1998+11焯25", "yyyy+MM焯dd");
        System.out.println(date);
        System.out.println("格式化输出");
        System.out.println(DateUtil.formatDate(date, "yyyy焯MM八嘎dd"));

    }
}
