package yunge.DesionModel.Singleton;

public class Student {
    private int id;
    private String name;
    private String sex;

    private Student() {
    }
    //饿汉
   /* private static Student student = new Student();
    public static Student getStudent() {
        return student;
    }*/

    //懒汉
    private static Student student = null;
    public static Student getStudent() {
        if(student == null){
            student = new Student();
        }
        return student;
    }

    public  int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
