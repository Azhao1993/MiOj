package MiOj_0119_MiRabbitJumpinglattice;

/*
	119.小米兔跳格子
		描述：
			米兔爸爸为了让小米兔好好锻炼身体，便给小米兔设置了一个挑战——跳格子。
			要吃到自己心爱的胡萝卜，小米兔需要跳过面前一些格子。
			现有 NN 个格子，每个格子内都写上了一个非负数，表示当前最多可以往前跳多少格，胡萝卜就放在最后一个格子上。
			米兔开始站在第 1 个格子，试判断米兔能不能跳到最后一个格子吃到胡萝卜呢？
		
		输入：
			输入为 N个数字 (N<10)，用空格隔开，
			第i个数字 s_i( 0<s_i<10) 表示米兔站在第 i个格子上时，最多能往前跳的格数。
		输出:
			若米兔能跳到最后一个格子上吃到胡萝卜，输出 “true“，否则输出 “false”
		输入样例:
			2 0 1 0 0 3 4
		输出样例:
			false
 */
import java.util.*;

public class Hopscotch {
	/**
	 * 已引入： java.util.* 要使用其他 jar 包请使用完整路径，如：
	 * java.util.List<java.util.List<Integer>> list = new
	 * java.util.ArrayList<java.util.List<Integer>>(100);
	 * 
	 * @param line 为单行测试数据
	 * @return 处理后的结果
	 */
	private static String solution(String line) {
		// please write your code here
		String[] str = line.split(" ");
		int[] arr = new int[str.length];
		for (int i = 0; i < arr.length; i++) {
			String temp = str[i];
			arr[i] = Integer.valueOf(temp);
		}

		for (int i = 0; i < arr.length;) {
			if (i + arr[i] >= arr.length - 1) {
				return "true";
			} else if (arr[i] != 0) {
				i = i + arr[i];
			} else {
				return "false";
			}
		}
		// return ans;
		return "false";
	}
}
