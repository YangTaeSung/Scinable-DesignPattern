// 오디오를 켜고 끌 때 쓸 커맨드 클래스를 만들기 위해
// 오디오를 켤 때 자동으로 CD가 재생되도록 하는 클래스
public class StereoOnWithCDCommand implements Command {
	
	Stereo stereo;
	
	// LightOnCommand와 마찬가지로 이 클래스를 써서 제어할 오디오의 인스턴스를 전달받음.
	public StereoOnWithCDCommand(Stereo stereo) {
		this.stereo = stereo;
	}
	
	// 오디오를 켜는 과정 
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(11);
	}

}
