package C;
/**
 * ������GUI�������ڵ���ʱ��
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Dingshi extends JFrame
{
	private JLabel label = new JLabel();
	private int time = 90;
	public void start() {
		setSize(500,400);
		setLayout(new FlowLayout());
		add(label);
		setVisible(true);
		while (time > 0)
		{
			time--;
			label.setText("��ʣ�ࣺ"+time + "s");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		setVisible(false);
}

public static void main(String[] args)
{
    Dingshi tes = new Dingshi();
    tes.start();
}
}