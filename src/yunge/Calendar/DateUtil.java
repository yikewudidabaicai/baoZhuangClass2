package yunge.Calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

/**
 * 日期工具类
 */
public class DateUtil {
    /**
     * 解析日期文本的方法
     * @param text
     * @param pattern
     * @return
     */


    public  static Date  pareDateText(String text,String pattern) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date parse = simpleDateFormat.parse(text);

        return parse;
    }

    /**
     * 把Date类型的值转换为指定格式的字符串
     * @param date  日期
     * @param pattern 规则
     * @return 文本日期
     */
    public static String formatDate(Date date,String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String format = simpleDateFormat.format(date);
        return format;
    }

}
