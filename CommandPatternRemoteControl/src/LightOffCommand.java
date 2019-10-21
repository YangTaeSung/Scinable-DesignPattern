
public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	// LightOffCommand�� ���ù��� �ٸ� �޼ҵ�(off()�޼ҵ�)�ϰ� ���ս�Ų�ٴ� ���� �����ϸ� LightOnCommand�ϰ� �Ȱ��� ������ �۵�
	public void execute() { 
		light.off();
	}
}
