
public class SimpleRemoteControl {
	Command slot; // 커맨드를 집어넣을 슬롯은 하나밖에 없다. 이것으로 장비를 제어
	
	public SimpleRemoteControl() {}
	
	// 슬롯을 가지고 제어할 명령을 설정하기 위한 메소드. 이 코드를 사용하는 클라이언트에서 리모컨 버튼의 기능을 바꾸고 싶다면 이 메소드를 이용해서 얼마든지 변경 가능
	public void setCommand(Command command) {
		slot = command;
	}
	
	// 버튼이 눌려지면 이 메소드 호출. 지금 슬롯에 연결된 커맨드 객체의 execute()메소드만 호출하면 된다.
	public void buttonWasPressed() {
		slot.execute();
	}
}
