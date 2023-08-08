package yunge.exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo {
    public static void main(String[] args) throws ParseException {
        String a = null;
        /**空指针异常 NullPointerException***/
        //a.equals("男");
        /**需要抛出异常**/
        new SimpleDateFormat("yyyy-MM-dd").parse("2018-11-11");
        int[] ints = {21,22,23};
        /**索引越界异常 ArrayIndexOutOfBoundsException**/
        //System.out.println(ints[5]);

        /**异常的处理：如果异常不手动处理，那么运行时异常会由jvm进行异常处理
         * （控制台输出异常信息并且关闭虚拟机 退出程序）**/
            /**处理方式1. 捕捉异常**/
               /* try {
                    //放入可能产上异常的代码

                }catch (异常类型 参数名){
                    //放入异常处理方案的代码

                }*/
                try {
                    //放入可能产上异常的代码
                    String aa = null;
                    /**空指针异常 NullPointerException***/
                    aa.equals("男");
                    int b = 21;//如果上一个异常被捕捉则跳到catch 块代码  此处向下则不再执行
                    int c = b/0;
                    System.out.println(c);
                }catch (NullPointerException e){
                    //放入异常处理方案的代码
                    System.out.println("对象空了，请认真检查");


                }catch (ArithmeticException e){
                    System.out.println("除数不能为零");
                }
                    /**其他处理方式**直接用其父类声明参数以捕捉所有子类异常**/
                    try {
                        int b = 21;
                        int c = b/0;
                        System.out.println(c);
                    }catch (RuntimeException e){
                        System.out.println("运行了 运行时异常的捕捉，，直接捕捉其父类之上的异常成功");
                        //多异常捕捉可以利用多态判断异常类型并给出不同的处理方案
                        if(e instanceof NullPointerException){
                            System.out.println("空指针异常");
                        }else if (e instanceof ArithmeticException){
                            System.out.println("除数为零异常");
                        }
                    }

            /**处理方式2. 抛出异常*详细见ExceptionDemo2* 不建议使用 发现异常及时捕捉**/

    }
}
