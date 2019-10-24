/*
 * 
 * 
 * Head First Design Pattern
 * Command Pattern
 * 리모컨에 파티모드 추가. 버튼 한 개만 누르면 전등이 어두워지면서 오디오, TV가 켜지고 DVD모드로 변경되고
 * 욕조에 물이 채워지는 것까지 한꺼번에 처리하는 기능 생성.
 * MacroCommand로 Command배열을 생성하여 여러 Command를 한번에 execute한다.
 * 
 * 
 */
public class RemoteLoader {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();
 
		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		// Party모드에 사용할 기능들 - 커맨드 배열 생성 
		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
		// 매크로커맨드를 만들어서 매개변수로 커맨드 배열을 넘겨준다.
		// 매크로커맨드의 생성자가 커맨드 배열을 받도록 작성되어 있다.
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		// RemoteControl 클래스의 setCommand메소드에서 Command 배열을 만들어 배개변수로 받은 partyOnMacro와 partyOffMacro 객체를
		// 처리하는데 partyOnMacro와 partyOffMacro는 이미 커맨드 배열이다. 즉 setCommand 메소드 내부에서의 동작은
		// 커맨드 배열 내부에서 커맨드 배열이 또 할당되어 있는 다중 배열의 형식이다.
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
