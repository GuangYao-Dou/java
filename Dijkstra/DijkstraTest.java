package Dijkstra;

public class DijkstraTest {
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] weight= {{0,-1,10,-1,30,100},{-1,0,5,-1,-1,-1},{-1,-1,0,50,-1,-1},{-1,-1,-1,0,-1,10},
				{-1,-1,-1,20,0,60},{-1,-1,-1,-1,-1,0}};
		String[] str= {"V1","V2","V3","V4","V5","V6"};
		int len=str.length;
		Dijkstra dijkstra=new Dijkstra(len);
		//�����ø��㵱Դ�㣬������dijkstra����
		for(int i=0;i<str.length;i++)
		{
			dijkstra.dijkstra(weight, str, i);
		}
	}
 
}
