
public class LightOnCommand implements Command {
	Light light;
	
	// 생성자에 이 커맨드 객체로 제어할 특정 전등(ex : "거실 전등")에 대한 정보가 전달. 
	// 그 객체는 light라는 인스턴스 변수에 저장.
	// execute()메소드가 호출되면 light객체가 바로 그 요청에 대한 리시버(Receiver)가 된다.
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() { // execute() 메소드에서는 리시버 객체(여기에서 제어하는 light 객체)에 있는 on()메소드를 호출
		light.on();
	}
}
