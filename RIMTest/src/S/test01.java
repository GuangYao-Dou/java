package S;
/**
 * ���ݿ������
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test01 {
	public static void main(String[] args) {
		test01 conn = new test01();
		conn.TheSqlConnection();
	}
//������SqlConnection ��
 
		/*
		*java����mysql���ݿ�
		*1��������������
		*2�����ݿ������ַ���
		*3�����ݿ��¼��
		*3�����ݿ��¼����
		*/
 
    private static final String URL = "jdbc:mysql://localhost:3306/vincenttest?" 
    		  + "serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false";//���ݿ������ַ����������deomΪ���ݿ���
    private static final String NAME="root";//��¼��
    private static final String PASSWORD="dgy2275517033";//����
	public void TheSqlConnection()
	{
		
        //1.��������
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("δ�ܳɹ������������������Ƿ�����������");
                        //���һ��println��������������쳣������Ƿ����������������������ַ����Ƿ����
			e.printStackTrace();
		}
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, NAME, PASSWORD); 
		        System.out.println("��ȡ���ݿ����ӳɹ���");
		} catch (SQLException e) {
			System.out.println("��ȡ���ݿ�����ʧ�ܣ�");
                        //���һ��println���������ʧ�ܣ���������ַ������ߵ�¼���Լ������Ƿ����
			e.printStackTrace();
		}
               //���ݿ�򿪺��Ҫ�ر�
		
	}
	public static Connection getconnection() throws SQLException {
		
		 
	    String URL = "jdbc:mysql://localhost:3306/vincenttest?" 
	    		  + "serverTimezone=UTC&useUnicode=true&characterEncoding=utf-8&useSSL=false";;//���ݿ������ַ����������deomΪ���ݿ���
	    String NAME="root";//��¼��
	    String PASSWORD="dgy2275517033";//����
	    return DriverManager.getConnection(URL, NAME, PASSWORD);
	}
}

