package yunge.FanShe.FanShegetFields;

public class Person {
	//私有成员变量	
	private String name;
    
    //默认成员变量
	int age;
    
    //公有成员变量
	public String address;

	//公有的有参构造方法 3个参数
	public Person(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
    //公有无参构造方法
	public Person() {
	}
    
	//私有的有参构造方法 1个参数
	private Person(String name) {
		this.name = name;
	}
    
	//默认的有参构造方法 2个参数
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
    

    
	//公有的无参无返回值方法
	public void show() {
		System.out.println("show");
	}
    
	//公有的有参无返回值方法
	public void method(String s) {
		System.out.println("method " + s);
	}
    
	//公有的有参有返回值方法
	public String getString(String s, int i) {
		return s + "---" + i;
	}
    
	//私有的无参无返回值方法
	private void function() {
		System.out.println("function");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address
				+ "]";
	}
}