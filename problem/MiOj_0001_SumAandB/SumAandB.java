package MiOj_0001_SumAandB;

import java.util.Scanner;

/*
	1.A+B
		描述
			和所有的 OJ 平台一样，第一题作为热身题，也是送分题：给出两个非负数 a 和b，输出 a+b 的结果。
		
		输入
			多组输入。	
			包含两个非负数 a 和 b，以空格分隔；a 和b 保证小于 2^32 	
		输出
			你的输出是对一行数据处理的结果，也即 a+b 的结果。
		
		输入样例
			233 666
			123 0	
		输出样例
			899
			123
				 
		小提示
			在小米 OJ 中，用例通过STDIN输入，以EOF结束。如果为多组输入，题目会明确说明。
		
		例程可能留有小坑，请仔细阅读题目，注意数据范围。
 */
public class SumAandB {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		// String line;
		while (scan.hasNext()) {
			// line = scan.nextLine().trim();
			// please write your code here
			long a = scan.nextLong();
			long b = scan.nextLong();
			// System.out.println("answer");
			System.out.println(a + b);
		}
	}
}
