package Mathequal;

import java.math.BigInteger;
import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] P = { 2, 3, 5, 13, 89, 233, 1597, 28657, 514229, 433494437 };
		BigInteger x = new BigInteger(String.valueOf("2971215073"));

		for (int p : P) {
			System.out.print(p / 3 % m);
			System.out.print(" ");
			System.out.println(p % m / 3);
		}

	}

}
