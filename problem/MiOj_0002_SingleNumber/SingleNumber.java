package MiOj_0002_SingleNumber;
/*
	2. �ҳ��������ֵ�����
		����
			����N�����֡����н���һ�����ֳ��ֹ�һ�Σ��������־����ֹ����Σ��ҳ����������ֻ���ֹ�һ�ε����֡�Ҫ��ʱ��Ϳռ临�Ӷ���С��
		����
			���������֣�ÿ�������Կո�ֿ����������� N < 20���������ֵ����ֵС�� 256.
		���
			�������Ϊֻ���ֹ�Ψһһ�ε�����
		��������
			10 10 11 12 12 11 16
		�������
			16
 */
import java.util.Scanner;

public class SingleNumber {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		//String line;
		int result  = 0;
		while (scan.hasNext()) {
			result ^= scan.nextInt();			
		}
		System.out.println(result);
	}
}
