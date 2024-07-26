package homework;
/*
 * 用递归实现斐波那契数列中第30个月兔子的数量
 */
public class RecurrenceDemo2 {

	public static void main(String[] args) {
		System.out.println(recurrence(30));
	}
	
	public static int recurrence(int n) {
		if(n == 1) {
			return 1;
		}else if(n == 2) {
			return 1;
		}else {
			return recurrence(n-2) + recurrence(n-1);
		}
	}
}
