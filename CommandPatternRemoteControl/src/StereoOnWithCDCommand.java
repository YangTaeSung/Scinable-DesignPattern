// ������� �Ѱ� �� �� �� Ŀ�ǵ� Ŭ������ ����� ����
// ������� �� �� �ڵ����� CD�� ����ǵ��� �ϴ� Ŭ����
public class StereoOnWithCDCommand implements Command {
	
	Stereo stereo;
	
	// LightOnCommand�� ���������� �� Ŭ������ �Ἥ ������ ������� �ν��Ͻ��� ���޹���.
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	// ������� �Ѵ� ���� 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

}
