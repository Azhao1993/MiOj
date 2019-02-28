#include<stdio.h>
#include<string.h>
#define N 401
#define inf 0x3f3f3f3f
int g[N][N];
int vis[N];
int d[N];
int n,m;
int Dijkstra()
{
	memset(d,inf,sizeof(d));
	memset(vis,0,sizeof(vis));
	int i,j,k;
	d[1]=0;
	int min;
	for(i=0;i<n;i++)
	{
		min=inf;
		for(j=1;j<=n;j++)
		{
			if(!vis[j]&&d[j]<min)
			{
				k=j;
				min=d[j];
			}
		}
		vis[k]=1;
		for(j=1;j<=n;j++)
		{
			if(!vis[j]&&g[k][j]+d[k]<d[j])
			{
				d[j]=g[k][j]+d[k];
			}
		}
	}
	if(d[n]==inf)    //起点无法走到走到终点，图不连通，返回-1
	return -1;
	return d[n];
}
int main()
{
	scanf("%d%d",&n,&m);
	int i,j;
	int x,y;
	int flag=0;
	memset(g,inf,sizeof(g));
	for(i=0;i<m;i++)
	{
		scanf("%d%d",&x,&y);
		if(x==1&&y==n||x==n&&y==1)
		flag=1;
		g[x][y]=1;
		g[y][x]=1;	
	}
	if(flag)// 如果起点和终点有铁路相连，则最短时间由汽车决定，求走公路的最短路径
	{
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				g[i][j]=g[i][j]==1?inf:1;
			}
		}
	}
	int ans=Dijkstra();
	printf("%d",ans);
	return 0;
} 
