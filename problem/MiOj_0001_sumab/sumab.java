package MiOj_0001_sumab;
import java.util.Scanner;
/*
	����
		�����е� OJ ƽ̨һ������һ����Ϊ�����⣬Ҳ���ͷ��⣺���������Ǹ��� a ��b����� a+b �Ľ����
	
	����
		�������롣	
		���������Ǹ��� a �� b���Կո�ָ���a ��b ��֤С�� 2^32 	
	���
		�������Ƕ�һ�����ݴ���Ľ����Ҳ�� a+b �Ľ����
	
	��������
		233 666
		123 0	
	�������
		899
		123
			 
	С��ʾ
		��С�� OJ �У�����ͨ��STDIN���룬��EOF���������Ϊ�������룬��Ŀ����ȷ˵����
	
	���̿�������С�ӣ�����ϸ�Ķ���Ŀ��ע�����ݷ�Χ��
 */
public class sumab {
	 public static void main(String args[]) {
	        Scanner scan = new Scanner(System.in);
	        //String line;
	        while (scan.hasNext()) {
	            //line = scan.nextLine().trim();
	            // please write your code here
	            long a = scan.nextLong();
	            long b = scan.nextLong();
	            // System.out.println("answer");
	            System.out.println(a+b);
	        }
	    }
}
