package homework;
/*
 * 手动实现求5的阶乘的实现方式
 */
public class RecurrenceDemo {

	public static void main(String[] args) {
		System.out.println(recurrence(5));
	}
	
	public static int recurrence(int n) {
		if (n == 1) {
			return 1;
		}else {
			return n * recurrence(n-1);
		}
	}
}
