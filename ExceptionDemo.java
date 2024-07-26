package homework;

import java.util.*;
import java.io.*;
/*
 * 定义Person类，Person类里面有年龄的属性，在给Person设置名字的时候，
 * 如果是负数或者大于150的时候 请抛出"AgeOutOfBoundsException(需要自己定义)"异常
 */
public class ExceptionDemo {

	public static void main(String[] args) throws AgeOutOfBoundsException{
		Person p = new Person(160);
	}
}

class AgeOutOfBoundsException extends Exception{
	public AgeOutOfBoundsException(){
		super();
	}
	
	public AgeOutOfBoundsException(String s) {
		super(s);
		System.out.println("自定义异常");
	}
}

class Person{
	int age;

	public Person(int age) throws AgeOutOfBoundsException{
		super();
		this.age = age;
		if(age<0 || age > 150) {
			throw new AgeOutOfBoundsException("年龄超出范围");
		}
	}
}
