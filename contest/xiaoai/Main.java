package xiaoai;

import java.util.Scanner;

public class Main {
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
