package yunge.log4jDemo;


import com.Main;
import org.apache.log4j.Logger;

public class log4jTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class);
        String a = null;
        System.out.println(a.equals("ppp"));
        logger.debug("高级日志");


    }
}
