package yunge.integer;

public class IntegerDemo {
    public static void main(String[] args) {
        /*********************创建包装类对象*********************/
        //根据基本数据类型值创建一个对应的包装类对象
        Integer integer = new Integer(58);
        //根据提供的字符串创建一个包装类对象
                                                /**数字转换异常**/
        //Integer integer1 = new Integer("abc");//必须传入数字组成的字符串 否则报NumberFormatException 异常
        Integer integer1 = new Integer("123");
        System.out.println(integer);
        System.out.println(integer1);
                //简写形式
        Integer integer2 = 21;/**自动装箱**/ //：基本数据类型直接转换为对应的包装类类型
        int pp = integer;/**自动拆箱**/ //：包装类对象自动转换为基本数据类型



        /***********************************/


    }
}
