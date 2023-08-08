package yunge.exception;

public class ExceptionDemo2 {
    public static void main(String[] args){
        try {
            test1();
            //此处乡下的两句输出将执行不了
            //System.out.println("今天天气不错");
            //System.out.println("几天距离周末还有三天");
        }catch (NullPointerException e){
            System.out.println("main方法处理了");

        }finally {/*****无论如何都要执行的代码***此处会在catch处理完之后执行 **/
            //无论try模块中的代码是否出现异常，这里的代码都会执行
            System.out.println("今天天气不错");
            System.out.println("几天距离周末还有三天");
        }
        /*****注意！！！！！ 如果finally之前有return 则finally会在return之前执行*****/
        /*final 是修饰符  修饰类的时候 该类不能被继承
                        修饰的成员变量成为常量 该常量一旦被赋值则不能被修改
                       修饰的成员方法为最终方法 无法被子类重
         finally  是异常处理中的一个结构模块  该模块类中的语句 无论try模块是否有异常都会执行
         finalize 是Object中提供的垃圾回收方法
          */
        //Object o = new Object();
        //o.finalize();



    }

    public static void test1() throws NullPointerException{
        String aa = null;
        /**空指针异常 NullPointerException***/
        //aa = "99";
        System.out.println(aa);
        aa.equals("男");

    }
}
