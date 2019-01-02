package C;
/**
 * �����пͻ������ӷ���˵Ĵ���
 */
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;
import S.SevFun;

public class client {
	public SevFun sevfun;
	public void startclien() throws MalformedURLException, RemoteException, NotBoundException {
		sevfun =  (SevFun) Naming.lookup("rmi://localhost:1998/severfun");
		Scanner input = new Scanner(System.in);
		int ID = 0;
//		System.out.println("�������¼����");
//		int ID = input.nextInt();
////		input.close();
//		System.out.println("���������룺");
////		Scanner input1 = new Scanner(System.in);
//		int key = input.nextInt();
//		System.out.println(sevfun.checkpassword(ID, key));
		while(true)
		{
			int choice = 0;
			System.out.println("����0�˳���Ϸ\n����1��¼��Ϸ\n����2�û�ע��");
			choice = input.nextInt();
			if(choice == 0) {
				System.out.println("��ѡ���˳�����Ϸ~~~");
				break;
			}
			else if(choice == 1) {
				while(true) {
					System.out.println("�������¼����");
					ID = input.nextInt();
					System.out.println("���������룺");
					String  key = input.next();
					if (sevfun.checkpassword(ID, key) ) {
						System.out.println("��¼�ɹ���");
						break;
					}
					else {
						System.out.println("�û���������������������룡����");
					}
				}
				
				while(true) {
					System.out.println("����0��ʼ��Ϸ\n����1��ѯǰʮ\n����2��ѯ�÷�\n����3���ص�¼����");
					int choice1 = input.nextInt();
					if(choice1 == 0) {
						int gamearr[] = sevfun.startGame();//�ڴ˴����һ��������飻
						System.out.print(gamearr[1]+"\t"+gamearr[2]+"\t"+gamearr[3]+"\t"+gamearr[0]+"\n");
						Dingshi tes = new Dingshi();
//					    tes.start();
					    System.out.println("��������ı��ʽ(����**��������)��");
					    String exper = input.next();
					    if(exper.equals("**")) {
					    	System.out.println("��ý�����˰�ˣ���һ��");
					    	sevfun.genxing(ID, -1);
					    	continue;
					    }
					    if(c_check.checkinput(exper, gamearr)) {        //�������ж��û�����ĺϷ���
	//					    System.out.println("�������");
						    if(sevfun.checkresult(exper) == 24.0) {
						    	System.out.println("��Ľ����ȷ��һ��");
						    	sevfun.genxing(ID, 1);
						    }
						    else {
						    	System.out.println(exper+"="+sevfun.checkresult(exper));
						    	System.out.println("��ļ������ʽ�д�!!!");
						    }
					    }else
					    {
					    	System.out.println("������ı��ʽ��û���õ��������ĳЩ����!��");
					    }
					}
					else if(choice1 == 1) {
						int arrID[] = sevfun.checkIDqianshi();
						int arrSC[] = sevfun.checkScoreqianshi();
						for(int i = 0,j = 1 ; i < 10; i++,j++)
							{
							System.out.print("��"+j+"����"+arrID[i]+"\t\t�÷֣�"+arrSC[i]+"\n");
							}
					}
					else if (choice1 == 3) {
							break;
					}
					else if (choice1 == 2) {
						int playerscore = sevfun.chaxun(ID);
						System.out.println("�㵱ǰ�ĵ÷�Ϊ��"+playerscore);
					}
					else {
						System.out.println("��������д�������������");
						continue ;
					}
					
				}
			}
	
			else if(choice == 2) {
				while(true) {	
					System.out.println("����������Ҫ���˺Ž�Ϊ����");
					int id = input.nextInt();
					System.out.println("������������룺");
					String key = input.next();
					if(sevfun.zhuce(id, key) == 1) {
						System.out.println("ע��ɹ�");
						break;
					}
					}
				}
			else {
				System.out.println("��������������������룺");
			}
		}
	}
		
		

//		int arr2[] = sevfun.checkIDqianshi();
//		int arr3[] = sevfun.checkScoreqianshi();
//		for(int i = 0,j = 1 ; i <10; i++,j++)
//			{
//			System.out.print("��"+j+"����"+arr2[i]+"\t\t�÷֣�"+arr3[i]+"\n");
//			}
		
		
//		int arr1[][] = sevfun.chaxunqianshi();
//		for(int i = 0; i < 5; i++) {
//		System.out.print(arr1[i][0]);
//		System.out.println(arr1[i][1]);
//	}
	
	
	
	public static void main(String[] args) {
		client cilen = new client();
		try {
			cilen.startclien();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
	}
}
