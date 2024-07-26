package homework;
/*
 * 定义Student类，里面有姓名，年龄，JavaStudent是Student的子类
 * 在创建JavaStudent的时候给姓名年龄赋值
 */
public class StudentDemo {

	public static void main(String[] args) {
		JavaStudent js = new JavaStudent(21, "Ziniu");
		System.out.println(js);
	}
}

class Student{
	int age;
	String name;
	
	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
}

class JavaStudent extends Student{

	public JavaStudent(int age, String name) {
		super(age, name);
	}
	
}
