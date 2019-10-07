import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingObserverExample {
	JFrame frame;
	
	public static void main (String[] args) {
		SwingObserverExample example = new SwingObserverExample();
		example.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton ("Right?");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.getContentPane().add(BorderLayout.CENTER, button);
		
		frame.setSize(200,200);
		frame.setVisible(true);
	}
	
	/******** AngelListener Ŭ������ DevilListener Ŭ������ ������ ���� ************/
	
	// ActionListener ����Ϸ��� < import java.awt.event.*; > ���� �ʿ�
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent evnet) { // ����(button)�� ���°� ����Ǿ��� �� update()�� �ƴ� actionPerformed �޼ҵ尡 ȣ��
			System.out.println("No");	 
		}
	}
	
	class DevilListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			System.out.println("Of course");
		}
	}
}
