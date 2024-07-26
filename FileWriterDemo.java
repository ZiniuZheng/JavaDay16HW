package homework;

import java.io.*;
import java.util.*;
/*
 * 手动实现FileWriter的try catch异常处理形式的完整模式
 */
public class FileWriterDemo {
	
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("/Users/zhengziniu/zzn.txt");
			fw.write("你好");
			System.out.println(2/0);
			fw.write("我在学Java");
			fw.flush();
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.flush();
				fw.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
