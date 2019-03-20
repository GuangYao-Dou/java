package bitdemo1;

import java.io.ObjectInputStream.GetField;

public class SingleTest {
	public static void main(String[] args) {
		testHunary hun = testHunary.getHun();
		testLazy laz = testLazy.getLazy();
		hun.hello();
		laz.hello();
	}
}
//����ģʽ
class testHunary{
	private testHunary() {
		
	}
	final static testHunary hungary = new testHunary();
	public static testHunary getHun() {
		return hungary;
	}
	public void hello() {
		System.out.println("���Ƕ���ģʽ");
	}
}

//����ģʽ
class testLazy{
	private testLazy() {
		
	}
	private static testLazy Lazy;
	public static testLazy getLazy() { 
		if(Lazy == null) {
			Lazy = new testLazy();
		}
		return Lazy;
	}
	public void hello() {
		System.out.println("��������ģʽ");
	}
}






