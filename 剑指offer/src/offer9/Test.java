package offer9;

import java.util.Map;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student []s1 = new Student[2];
		s1[0]=new Student("小张");
		Student []s2 =new Student[2];
		s2[0]= new Student("小李");
		Test.swap(s1, s2);
		System.out.println("s1:" + s1[0].getName());
		System.out.println("s2:" + s2[0].getName());
	}

	public static void swap(Student []x, Student []y) {
		Student temp = x[0];
		x[0] = y[0];
		y[0] = temp;
		System.out.println("x:" + x[0].getName());
		System.out.println("y:" + y[0].getName());
	}
}
class Student{
	String name;
	Map m=null;
	String getName() {
		return name;
	}
	Student(String name){
		this.name=name;
	}
}