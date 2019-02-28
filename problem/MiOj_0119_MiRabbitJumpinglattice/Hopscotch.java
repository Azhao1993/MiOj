package MiOj_0119_MiRabbitJumpinglattice;

/*
	119.С����������
		������
			���ðְ�Ϊ����С���úúö������壬���С����������һ����ս���������ӡ�
			Ҫ�Ե��Լ��İ��ĺ��ܲ���С������Ҫ������ǰһЩ���ӡ�
			���� NN �����ӣ�ÿ�������ڶ�д����һ���Ǹ�������ʾ��ǰ��������ǰ�����ٸ񣬺��ܲ��ͷ������һ�������ϡ�
			���ÿ�ʼվ�ڵ� 1 �����ӣ����ж������ܲ����������һ�����ӳԵ����ܲ��أ�
		
		���룺
			����Ϊ N������ (N<10)���ÿո������
			��i������ s_i( 0<s_i<10) ��ʾ����վ�ڵ� i��������ʱ���������ǰ���ĸ�����
		���:
			���������������һ�������ϳԵ����ܲ������ ��true����������� ��false��
		��������:
			2 0 1 0 0 3 4
		�������:
			false
 */
import java.util.*;

public class Hopscotch {
	/**
	 * �����룺 java.util.* Ҫʹ������ jar ����ʹ������·�����磺
	 * java.util.List<java.util.List<Integer>> list = new
	 * java.util.ArrayList<java.util.List<Integer>>(100);
	 * 
	 * @param line Ϊ���в�������
	 * @return �����Ľ��
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
