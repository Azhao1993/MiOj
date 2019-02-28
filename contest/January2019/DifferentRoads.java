package January2019;

/*
	127:殊途同归
		描述:
			在小米之城，有 n 个小镇（从 1 开始编号），这些小镇通过 m 条双向火车铁轨相连，当然某些小镇之间也有公路相连。
			为了保证每两个小镇之间的人可以方便地互访，市长米小兔就在那些没有铁轨连接的小镇间建造了公路。
			在两个直接通过公路或铁路相连的小镇之间移动，需要花费 1 小时。火车只能走铁路，汽车只能走公路。
			
			现在有一辆火车和一辆汽车同时从小镇 1 出发，各自前往小镇 n。
			但是，他们中途不能同时停在同一个小镇（但是可以同时停在小镇n）。
			
			现在请你来为火车和汽车分别设计一条线路，使火车和汽车尽可能快地到达小镇 n
			（即要求他们中最后到达小镇 n 的时间最短）。
			
			所有的公路或铁路可以被多次使用，求火车、汽车中到达小镇时间最小的一个。
			(火车和汽车可以同时到达小镇 n，也可以先后到达。)
		
		输入：
			单组测试数据。
			首先有 2 个整数 n 和 m (2 <= n <= 400, 0 <= m <= n (n-1)/2)，分别表示小镇的数目和铁轨的数目；
			
			接下来的 m对数字，每对由两个整数 u 和 v 构成，表示小镇 u 和小镇 v 之间有一条铁路。(1 <= u,v <= n, u!=v)。
			
			输入中保证两个小镇之间最多有一条铁路直接相连。
		
		输出:
			输出一个整数，表示答案，如果没有合法的路线规划，输出 -1.
		
		输入样例:
			4 2 1 3 3 4
		输出样例:
			2
 */
/*
	题解：起点和终点间不是有铁路连接，就是有公路连接，
	若有铁路连接，肯定汽车要晚到，求走公路的最短路径
	若有公路连接，肯定火车要晚到，求走铁路的最短路径
	因为最快的路肯定是起点直接到终点，而且只可能是走铁路或公路的一种
	另一种乘车的方式就要绕路走，所以在最短时间的要求下不存在火车和汽车
	在同一站相遇的情况
	--------------------- 
	作者：saplingyang 
	来源：CSDN 
	原文：https://blog.csdn.net/saplingyang/article/details/79235691 
	版权声明：本文为博主原创文章，转载请附上博文链接！
*/
public class DifferentRoads {
	private static String solution(String line) {
		// please write your code here
		String[] str = line.split(" ");
		// 城市的个数
		int city = Integer.parseInt(str[0]);
		// 铁路的条数
		int railway = Integer.parseInt(str[1]);
		//
		int[][] rail = new int[city][city];
		for (int i = 2; i < railway * 2 + 2; i++) {
			rail[Integer.valueOf(str[i++]) - 1][Integer.valueOf(str[i]) - 1] = 1;
		}
		//公路先到,返回铁路的最短路径
		int result = 0;
		if(rail[0][city-1]!=1) {
			result =  Dijkstra(rail,1,1,city,0);
		}else {
			//铁路先到，返回公路的最短路径
			result = Dijkstra(rail,0,1,city,0);
		}
		return String.valueOf(result);

		// return ans;
	}

	private static int Dijkstra(int[][] rail, int flag, int begin,int city,int result) {
		if(begin==city) {
			return result;
		}
		for(int i = begin;i<city;i++) {			
			if(rail[0][i]==flag) {
				result
			}
		}
	}
}
