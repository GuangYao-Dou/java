package test001;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;
import javax.swing.plaf.synth.SynthSeparatorUI;

public class game {
	public static void main(String[] args) {
		numbergame gam = new numbergame();
		gam.startgame();
	}

}
class numbergame
{
	Scanner input = new Scanner(System.in);
	void game()
	{
		//Scanner input = new Scanner(System.in);
		int num = (int)(Math.random()*101);
		int guess = 0;
		while(guess != num )
		{
			System.out.println("��������Ĳ²⣺");
			guess =  input.nextInt();
			if(guess > num)
			{
				System.out.println("����");
			}
			else if(guess < num)
			{
				System.out.println("С��");
			}
			
		}
//		input.close();
		System.out.println("�¶���");
	}
	void startgame() 
	{
		
		int choice = 1 ;
		while(choice != 0) 
		{
			System.out.println("==============================");
			System.out.println("0 => �˳���Ϸ\n1 => ��ʼ��Ϸ");
			System.out.println("==============================");
			choice = input.nextInt();
			if (choice == 0)
			{
				System.out.println("�˳�");
			}
			else if(choice == 1)
			{
				game();
			}
		}
		
//		input.close();
	}
}

