package S;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

/**
 * ����˰�
 * @author ����ҫ
 *
 */
public class Sever {
		SevFun severefun;
		public void ser() throws RemoteException, MalformedURLException, AlreadyBoundException {
			severefun = new database();
			LocateRegistry.createRegistry(1998);
			Naming.bind("rmi://localhost:1998/severfun",severefun);
			System.out.println("�����:����󶨳ɹ���");
		}
		public static void main(String[] args) {
			try {
				Sever sever = new Sever();
				sever.ser();
				while(true);
			} catch (RemoteException | MalformedURLException | AlreadyBoundException e) {
				e.printStackTrace();
			}
		}
}
