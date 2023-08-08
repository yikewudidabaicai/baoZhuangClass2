package yunge.enumMeiJvClass.mod1;

public enum Direction {
	/*
	 * 通过JDK5提供的枚举来做枚举类
	 */
	/*****提前定义好的FRONT, BEHIND, LEFT, RIGHT;
	 * 并不是字符串值
	 * 本质上它们是四个枚举类的对象
	 * 所以需要有匹配的构造方法
	 */
	//枚举类的对象必须写在最前面，而且必须在同一行
	FRONT, BEHIND("后"), LEFT("左",45), RIGHT;

	public String mess;
	public int a;
	Direction() {
	}

	Direction(String mess) {
		this.mess = mess;
	}

	Direction(String mess, int a) {
		this.mess = mess;
		this.a = a;
	}

	public void show(){
		System.out.println("展示");
	}


}