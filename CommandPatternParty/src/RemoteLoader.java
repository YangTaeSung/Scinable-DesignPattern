/*
 * 
 * 
 * Head First Design Pattern
 * Command Pattern
 * �������� ��Ƽ��� �߰�. ��ư �� ���� ������ ������ ��ο����鼭 �����, TV�� ������ DVD���� ����ǰ�
 * ������ ���� ä������ �ͱ��� �Ѳ����� ó���ϴ� ��� ����.
 * MacroCommand�� Command�迭�� �����Ͽ� ���� Command�� �ѹ��� execute�Ѵ�.
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

		// Party��忡 ����� ��ɵ� - Ŀ�ǵ� �迭 ���� 
		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn};
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff};
  
		// ��ũ��Ŀ�ǵ带 ���� �Ű������� Ŀ�ǵ� �迭�� �Ѱ��ش�.
		// ��ũ��Ŀ�ǵ��� �����ڰ� Ŀ�ǵ� �迭�� �޵��� �ۼ��Ǿ� �ִ�.
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		// RemoteControl Ŭ������ setCommand�޼ҵ忡�� Command �迭�� ����� �谳������ ���� partyOnMacro�� partyOffMacro ��ü��
		// ó���ϴµ� partyOnMacro�� partyOffMacro�� �̹� Ŀ�ǵ� �迭�̴�. �� setCommand �޼ҵ� ���ο����� ������
		// Ŀ�ǵ� �迭 ���ο��� Ŀ�ǵ� �迭�� �� �Ҵ�Ǿ� �ִ� ���� �迭�� �����̴�.
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
