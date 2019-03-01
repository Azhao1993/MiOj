
/*
	138.Carryon 数数字
		描述
			Carryon 最近迷上了数数字，然后 Starry 给了他一个区间 [l,r] ,然后提了几个要求，		
			需要将 l 到 r 之间的数全部转化成 16 进制，然后连起来。
			将连起来的数又转化成 10 进制。
			将最终结果对 15 取模。
		数据范围：1<=l<=r<=1000000000000
		输入
			单组输入 ll 和 rr 的值		
		输出
			输出最终结果。
		
		输入样例
			10 14		
		输出样例
			0
		 
		小提示
			如：10、11、12、13、14的16进制分别是a、b、c、d、e。依次连在一起是abcde，转换成10进制是703710，对15取模为0。
 */

import java.util.Scanner;

public class CarrayonCounting {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		long l = scan.nextLong();
		long r = scan.nextLong();
		long count = (r - l + 1) % 15;
		l %= 15;

		long sum = 0;
		for (long i = 0; i < count; i++) {
			sum += l++;
		}

		System.out.println(sum % 15);

	}
}