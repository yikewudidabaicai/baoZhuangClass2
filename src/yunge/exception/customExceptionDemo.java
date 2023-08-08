package yunge.exception;

/**z
 * 自定义异常测试
 */
public class customExceptionDemo {
    public static void main(String[] args) throws AgeException {
        int age = -30;

        if(age>=3000){
            throw new AgeException("年龄不科学");
        }else if(age<0){
            throw new AgeException("未出生");
        }


    }
}
