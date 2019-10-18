
public class RemoteControlTest { // Ŀ�ǵ� ���Ͽ��� Ŭ���̾�Ʈ(Client)�� �ش��ϴ� �κ�
	public static void main(String[] args) {
		
		// remote ������ �κ�Ŀ(Invoker) ����. �ʿ��� �۾��� ��û�� �� ����� Ŀ�ǵ� ��ü�� ���ڷ� ���޹޴´�. 
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		// ��û�� �޾Ƽ� ó���� ���ù�(Receiver)�� Light��ü ���� 
		Light light = new Light();
		
		// Ŀ�ǵ� ��ü�� ����. �� �� ���ù�(light)�� ����
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn); // Ŀ�ǵ� ��ü�� �κ�Ŀ���� ����.
		remote.buttonWasPressed(); 
	}
}
