
/*
	138.Carryon ������
		����
			Carryon ��������������֣�Ȼ�� Starry ������һ������ [l,r] ,Ȼ�����˼���Ҫ��		
			��Ҫ�� l �� r ֮�����ȫ��ת���� 16 ���ƣ�Ȼ����������
			��������������ת���� 10 ���ơ�
			�����ս���� 15 ȡģ��
		���ݷ�Χ��1<=l<=r<=1000000000000
		����
			�������� ll �� rr ��ֵ		
		���
			������ս����
		
		��������
			10 14		
		�������
			0
		 
		С��ʾ
			�磺10��11��12��13��14��16���Ʒֱ���a��b��c��d��e����������һ����abcde��ת����10������703710����15ȡģΪ0��
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