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
	
	/******** AngelListener 클래스와 DevilListener 클래스가 옵저버 역할 ************/
	
	// ActionListener 사용하려면 < import java.awt.event.*; > 구문 필요
	class AngelListener implements ActionListener {
		public void actionPerformed(ActionEvent evnet) { // 주제(button)의 상태가 변경되었을 때 update()가 아닌 actionPerformed 메소드가 호출
			System.out.println("No");	 
		}
	}
	
	class DevilListener implements ActionListener {
		public void actionPerformed (ActionEvent event) {
			System.out.println("Of course");
		}
	}
}
