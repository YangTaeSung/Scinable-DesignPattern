
public class SimpleRemoteControl {
	Command slot; // Ŀ�ǵ带 ������� ������ �ϳ��ۿ� ����. �̰����� ��� ����
	
	public SimpleRemoteControl() {}
	
	// ������ ������ ������ ����� �����ϱ� ���� �޼ҵ�. �� �ڵ带 ����ϴ� Ŭ���̾�Ʈ���� ������ ��ư�� ����� �ٲٰ� �ʹٸ� �� �޼ҵ带 �̿��ؼ� �󸶵��� ���� ����
	public void setCommand(Command command) {
		slot = command;
	}
	
	// ��ư�� �������� �� �޼ҵ� ȣ��. ���� ���Կ� ����� Ŀ�ǵ� ��ü�� execute()�޼ҵ常 ȣ���ϸ� �ȴ�.
	public void buttonWasPressed() {
		slot.execute();
	}
}
