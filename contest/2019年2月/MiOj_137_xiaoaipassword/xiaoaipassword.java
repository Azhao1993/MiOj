
/*
	137.小爱密码
	描述
		小爱同学有一个智能密码锁。锁上有九位数字，小爱同学每次会给A,B,C,D,mod,n六个正整数。 题目是这样的：
		
		F(1)=A,F(2)=B
		F(n)=F(n−1)F(n−2)C^D (n>2)
		
		现在小爱同学想计算出 G(n)G(n) 的值（G(n)为F(n)的前n项积），并用该值作为密码锁的密码。		
		由于结果过大，所以答案 G(n)%mod
		
		输入
			多组数据。每组包含 6 个整数，分别代表 A, B, C, D, mod, n. (1<=A,B,C,D,mod,n<=1000000000)；数据组数不超过 2000.		
		输出
			输出 G(n)%mod 的值。		
			答案保留 9 位有效数字，不足则补 0.
		
		输入样例
			2 2 2 2 1000 3
			7 9 3 4 6 5		
		输出样例
			000000064
			000000003
 */
import java.util.Scanner;

public class xiaoaipassword {
	public static void main(String args[]) {		
		
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()) {
			long A = scan.nextLong();
			long B = scan.nextLong();
			long C = scan.nextLong();
			long D = scan.nextLong();
			long mod = scan.nextLong();
			long n = scan.nextLong();

			int[] arr = get(n);
			long res = (long) (Math.pow(A, arr[0])% mod) * (long) (Math.pow(B, arr[1])% mod) * (long) (Math.pow(C, arr[2] * D)% mod)
					% mod;
			System.out.println(String.format("%09d", res));
		}
	}

	private static int[] get(long n) {
		int[] result = new int[3];
		int[] arr = { 1, 1 };
		int[] brr = { 0, 1 };
		int[] crr = { 0, 0 };
		for (int i = 0; i < n - 2; i++) {
			int temp = arr[1];
			arr[1] = arr[0] + arr[1];
			arr[0] = temp;

			int tempb = brr[1];
			brr[1] = brr[1] + arr[0];
			brr[0] = tempb;

			int tempc = crr[1];
			crr[1] = crr[1] + brr[0];
			crr[0] = tempc;

		}
		result[0] = arr[1];
		result[1] = brr[1];
		result[2] = crr[1];
		return result;
	}

}
