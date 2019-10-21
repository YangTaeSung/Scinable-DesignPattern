/*
 * 
 * Head First Design Pattern
 * Command Pattern
 * 
 * 
 */
public class RemoteControl {
	Command [] onCommands; // 리모컨의 On 명령
	Command [] offCommands;  // 리모컨의 Off 명령
	
	public RemoteControl() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand(); // On, Off 명령 초기화
		for(int i = 0; i < 7; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	// 슬롯 번호와 그 슬롯 번호에 저장할 On, Off 명령(Command)을 전달받아 각 커맨드 객체를 나중에 사용할 수 있도록 배열에 저장
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	
	// 사용자가 On, Off 버튼을 눌렀을 때
	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
	}
	
	
	//각 슬롯별 명령을 출력하도록 toString()을 오버라이드, 리모컨 테스트용
	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n----- Remote Control -----\n");
		for(int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
