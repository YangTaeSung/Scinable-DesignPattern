/*
 * 
 * Head First Design Pattern
 * Command Pattern
 * 
 * 
 */
public class RemoteControl {
	Command [] onCommands; // �������� On ���
	Command [] offCommands;  // �������� Off ���
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand(); // On, Off ��� �ʱ�ȭ
		for(int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	// ���� ��ȣ�� �� ���� ��ȣ�� ������ On, Off ���(Command)�� ���޹޾� �� Ŀ�ǵ� ��ü�� ���߿� ����� �� �ֵ��� �迭�� ����
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	
	// ����ڰ� On, Off ��ư�� ������ ��
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	
	//�� ���Ժ� ����� ����ϵ��� toString()�� �������̵�, ������ �׽�Ʈ��
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n----- Remote Control -----\n");
		for(int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
