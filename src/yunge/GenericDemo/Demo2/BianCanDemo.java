package yunge.GenericDemo.Demo2;

public class BianCanDemo {
    public static void main(String[] args) {
        Hello<String> s = new Hello<>();
            s.speak();
            s.speak("哈哈");
            s.speak("呵呵","hi");
            s.speak("呵呵","hi","喜喜");

        }

    /****可变参数方法，可以传入0个或者多个参数的方法***/
    public void say(){


    }

}
