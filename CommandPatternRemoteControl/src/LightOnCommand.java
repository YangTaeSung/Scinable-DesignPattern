
public class LightOnCommand implements Command {
	Light light;
	
	// �����ڿ� �� Ŀ�ǵ� ��ü�� ������ Ư�� ����(ex : "�Ž� ����")�� ���� ������ ����. 
	// �� ��ü�� light��� �ν��Ͻ� ������ ����.
	// execute()�޼ҵ尡 ȣ��Ǹ� light��ü�� �ٷ� �� ��û�� ���� ���ù�(Receiver)�� �ȴ�.
	public LightOnCommand(Light light) {
		this.light = light;
	}
	
	public void execute() { // execute() �޼ҵ忡���� ���ù� ��ü(���⿡�� �����ϴ� light ��ü)�� �ִ� on()�޼ҵ带 ȣ��
		light.on();
	}
}
