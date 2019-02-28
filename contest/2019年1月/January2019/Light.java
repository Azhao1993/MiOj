package January2019;

/*
	125:灯
		描述：
			一个屋子有 n 个开关控制着 n 盏灯，但奇怪的是，
			每个开关对应的不是一盏灯，而是 n-1 盏灯，
			每次按下这个开关，其对应的 n-1 盏灯就会由亮变灭，或者由灭变亮。
			保证不会有两个开关控制同样的 n-1 盏灯。
		
		现在刘同学想把灯全部开好，但是这些灯一开始的状态非常乱，刘同学想知道最少需要按多少次开关才能使所有灯全部亮起。
		
		输入：
			单组数据输入，每组数据一行，两个数 n,l 分别代表灯的数量、最开始时亮着的灯的数量（1<l<n<10000000000）。
		输出：
			每组数据输出一个数，即能使所有灯全部亮起的最少的按开关的次数，如果无法做到灯全部亮起，输出“Impossible”
		
		输入样例：
			4 2
		输出样例
			2
 */
/*
	如果避开一盏亮灯，改变其它n-1盏等，那么将有 n-m+1 盏亮
	如果避开一盏暗灯，改变其它n-1盏等，那么将有 n-m-1 盏亮
	也就是由 m 盏灯亮，通过一步可变为 n-m+1 盏亮，或 n-m-1 盏亮。
	
	最后应该有n盏灯亮，那么倒数第二步就应该有1盏灯亮，倒数第三步就应该有n-2盏灯亮，……
	由后往前亮灯的盏数：n-0、1、n-2、3、n-4、5、n-6、……，规律很明显
	
	结论就是：
		如果n为偶数、m为偶数：n-m
		如果n为偶数、m为奇数：m
		如果n为奇数、m为偶数：不可能
		如果n为奇数、m为奇数：n-m和m两者之最小值
 */
public class Light {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "4 2";
		Light.solution(line);
	}

	private static String solution(String line) {
		// please write your code here
		String[] str = line.split(" ");
		long[] arr = new long[str.length];
		for (int i = 0; i < arr.length; i++) {
			String temp = str[i];
			java.math.BigInteger bi = new java.math.BigInteger(temp, 10);
			arr[i] = bi.longValue();
		}
		// n
		long n = arr[0];
		// m
		long m = arr[1];
		if (n % 2 == 0) {
			if (m % 2 == 0) {
				return String.valueOf(n - m);
			} else {
				return String.valueOf(m);
			}
		} else {
			if (m % 2 == 0) {
				return "Impossible";
			} else {
				long result = Math.min(n - m, m);
				return String.valueOf(result);
			}
		}
		// return ans;
	}

}
