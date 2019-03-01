
/*
	137.灏忕埍瀵嗙爜
	鎻忚堪
		灏忕埍鍚屽鏈変竴涓櫤鑳藉瘑鐮侀攣銆傞攣涓婃湁涔濅綅鏁板瓧锛屽皬鐖卞悓瀛︽瘡娆′細缁橝,B,C,D,mod,n鍏釜姝ｆ暣鏁般�� 棰樼洰鏄繖鏍风殑锛�
		
		F(1)=A,F(2)=B
		F(n)=F(n鈭�1)F(n鈭�2)C^D (n>2)
		
		鐜板湪灏忕埍鍚屽鎯宠绠楀嚭 G(n)G(n) 鐨勫�硷紙G(n)涓篎(n)鐨勫墠n椤圭Н锛夛紝骞剁敤璇ュ�间綔涓哄瘑鐮侀攣鐨勫瘑鐮併��		
		鐢变簬缁撴灉杩囧ぇ锛屾墍浠ョ瓟妗� G(n)%mod
		
		杈撳叆
			澶氱粍鏁版嵁銆傛瘡缁勫寘鍚� 6 涓暣鏁帮紝鍒嗗埆浠ｈ〃 A, B, C, D, mod, n. (1<=A,B,C,D,mod,n<=1000000000)锛涙暟鎹粍鏁颁笉瓒呰繃 2000.		
		杈撳嚭
			杈撳嚭 G(n)%mod 鐨勫�笺��		
			绛旀淇濈暀 9 浣嶆湁鏁堟暟瀛楋紝涓嶈冻鍒欒ˉ 0.
		
		杈撳叆鏍蜂緥
			2 2 2 2 1000 3
			7 9 3 4 6 5		
		杈撳嚭鏍蜂緥
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
