package S;
/**
 * �ڱ����м̳�SevFun�ӿ�Ȼ��Խӿ��������ķ�����д��ʵ������
 */
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.spi.DirStateFactory.Result;
/**
 * Author ������ҫ
 * 1 �����װ�˸���ID��֤���ݿ�����ķ�����
 * 2 �����ݿ�ĸ��²�����
 * 3 �����ݿ�����ݲ��룻
 * 4 �����ݿ��еĵ÷ֲ�ѯ��
 * 5 �������ݿ����û���Ϣ��ɾ����
 */
public class database  extends UnicastRemoteObject implements SevFun{
	protected database() throws RemoteException {
		super();
	}
//	public static void main(String[] args) {
////		System.out.println(checkpassword(20181223, "12346"));
////		genxing(20181222, 1);
////		System.out.println(chaxun(20181223));
////		System.out.println(checkpassword(20181223, "123456"));
////		System.out.println(shanchu(20153));
//		int arr[][] = chaxunqianshi();
//		for(int i = 0; i < 5; i++) {
//			System.out.print(arr[i][0]);
//			System.out.println(arr[i][1]);
//		}
//		chaxunqianshi();
//	}
	//��֤���룺
	public boolean checkpassword(int idnum,String  pas)
	{
		String password = " ";
		String sql = "select Password from Vincenttest.kcsj where ID = '"+idnum+"'";
		try {
			Statement sta = test01.getconnection().createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				password = rs.getString("Password");  //�ڴ�������ID��ȡ��Ӧ�����룻
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
												//�ڴ�������������������ݿ��е�������бȽ�
		if(pas.equals(password))			
		{
			return true ;
		}
		else
		{
			return false ;
		}

	}
	
	//�˷���������������
	public int genxing(int idnum,int sco)
	{
		int scor = chaxun(idnum) + sco ;
		int i = 0;  //�����ж�sql����ִ�� 
		String sql = "UPDATE vincenttest.kcsj set Score = '"+scor+"' where ID = '"+idnum+"'";
		try {
			Connection conn = test01.getconnection();
			Statement sta = conn.createStatement();
			i = sta.executeUpdate(sql);//ִ�гɹ� i = 1 ��
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i ;
	}
	//�˷����������ݵĲ����û�ע��
	public int zhuce(int idnum, String pas)
	{
		int sco = 0 ;
		int i = 0;
		String sql = "insert into vincenttest.kcsj (ID,Password,Score) Values('"+idnum+"','"+pas+"','"+sco+"')";
		try {
			Connection conn = test01.getconnection();
			Statement sta = conn.createStatement();
			i = sta.executeUpdate(sql); //ִ�гɹ� i = 1 
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i;
	}
	
	//�˷������ڶԷ����Ĳ�ѯ
	public int chaxun(int idnum)
	{
		int sco = 0 ;
		String sql = "select Score from Vincenttest.kcsj where ID = '"+idnum+"'";
		try {
			Statement sta = test01.getconnection().createStatement();
			ResultSet rs = sta.executeQuery(sql);
			while(rs.next()){
				sco = rs.getInt("Score");  //�ڴ˴���ȡ��Ӧ�ķ�����
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return sco;
	}
	//�˷�������ע���û���
	public int shanchu(int idnum)
	{
		int i = 0 ; // �����ж�sql����ִ��Ч����
		String sql = "DELETE from vincenttest.kcsj where ID = '"+idnum+"'";
		try {
			Connection conn = test01.getconnection();
			Statement sta =  conn.createStatement();
			i = sta.executeUpdate(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return i ;     //ִ�гɹ�����1��
	}
		
	//�˷�������ʵ����Ϸ����������
	public  int[] startGame()
	{
		int arr[] = {0,0,0,0};
		arr = game24.startGame();
		return arr;
	}
	
	//�˷������������ַ�������ѧ���ʽ�ļ���
	public double checkresult(String str)
	{
		double daan = 0 ;
		daan = Calculator.conversion(str);
		return daan;
	}
	//�˷���������ѯǰʮ��
	public  int [][] chaxunqianshi()
	{
		int i = 1 ;
		int a = 0;
		int b = 0;
		int arr[][] = null ;
		String sql = "SELECT ID,Score FROM vincenttest.kcsj order by Score DESC";
		try {
			Connection conn = test01.getconnection();
			Statement sta = conn.createStatement();
			ResultSet rs =  sta.executeQuery(sql);
//			String e = null ;
//			while(rs.next()){
//				a = rs.getString("ID");
//				b = rs.getString("Password");
//				c = rs.getString("Score");

			while(rs.next())
			{
				arr[i][0]= rs.getInt("ID");
				arr[i][1]= rs.getInt("Score");
//				System.out.println("��"+i+"����"+a[i][0]+"\t"+"�÷�Ϊ��"+b);
				i++;
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr;
	}
	//��ѯǰʮ��ID
	public int [] checkIDqianshi() {
		int arr[] = {0,0,0,0,0,0,0,0,0,0} ;
		int i = 0 ;
		String sql = "SELECT ID FROM vincenttest.kcsj order by Score DESC";
		try {
			Connection conn = test01.getconnection();
			Statement sta = conn.createStatement();
			ResultSet rs =  sta.executeQuery(sql);
			while(rs.next()) {
				arr[i] = rs.getInt("ID");
				i++;
				if(i==10)
				{
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr ;
	}
	//��ѯǰʮ�ĳɼ�(Score)
	public int [] checkScoreqianshi()
	{
		int arr[] = {0,0,0,0,0,0,0,0,0,0} ;
		int i = 0 ;
		String sql = "SELECT Score FROM vincenttest.kcsj order by Score DESC";
		try {
			Connection conn = test01.getconnection();
			Statement sta = conn.createStatement();
			ResultSet rs =  sta.executeQuery(sql);
			while(rs.next()) {
				arr[i] = rs.getInt("Score");
				i++;
				if(i==10)
				{
					break;
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return arr ;
	}
}
