
public class RemoteControlTest { // 커맨드 패턴에서 클라이언트(Client)에 해당하는 부분
	public static void main(String[] args) {
		
		// remote 변수가 인보커(Invoker) 역할. 필요한 작업을 요청할 때 사용할 커맨드 객체를 인자로 전달받는다. 
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// 요청을 받아서 처리할 리시버(Receiver)인 Light객체 생성 
		Light light = new Light();
		
		// 커맨드 객체를 생성. 이 때 리시버(light)를 전달
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn); // 커맨드 객체를 인보커한테 전달.
		remote.buttonWasPressed(); 
	}
}
