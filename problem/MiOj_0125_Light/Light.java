package January2019;

/*
	125:��
		������
			һ�������� n �����ؿ����� n յ�ƣ�����ֵ��ǣ�
			ÿ�����ض�Ӧ�Ĳ���һյ�ƣ����� n-1 յ�ƣ�
			ÿ�ΰ���������أ����Ӧ�� n-1 յ�ƾͻ��������𣬻������������
			��֤�������������ؿ���ͬ���� n-1 յ�ơ�
		
		������ͬѧ��ѵ�ȫ�����ã�������Щ��һ��ʼ��״̬�ǳ��ң���ͬѧ��֪��������Ҫ�����ٴο��ز���ʹ���е�ȫ������
		
		���룺
			�����������룬ÿ������һ�У������� n,l �ֱ����Ƶ��������ʼʱ���ŵĵƵ�������1<l<n<10000000000����
		�����
			ÿ���������һ����������ʹ���е�ȫ����������ٵİ����صĴ���������޷�������ȫ�����������Impossible��
		
		����������
			4 2
		�������
			2
 */
/*
	����ܿ�һյ���ƣ��ı�����n-1յ�ȣ���ô���� n-m+1 յ��
	����ܿ�һյ���ƣ��ı�����n-1յ�ȣ���ô���� n-m-1 յ��
	Ҳ������ m յ������ͨ��һ���ɱ�Ϊ n-m+1 յ������ n-m-1 յ����
	
	���Ӧ����nյ��������ô�����ڶ�����Ӧ����1յ������������������Ӧ����n-2յ����������
	�ɺ���ǰ���Ƶ�յ����n-0��1��n-2��3��n-4��5��n-6�����������ɺ�����
	
	���۾��ǣ�
		���nΪż����mΪż����n-m
		���nΪż����mΪ������m
		���nΪ������mΪż����������
		���nΪ������mΪ������n-m��m����֮��Сֵ
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
