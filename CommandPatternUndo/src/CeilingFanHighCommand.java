
public class CeilingFanHighCommand implements Command {
	CeilingFan ceilingFan;
	int prevSpeed; // 상태지역변수, 선풍기의 기존 속도를 저장하기 위한 변수
  
	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
 
	public void execute() {
		// Undo 명령이 실행될 것을 대비하여 현재 속도를 prevSpeed에 저장
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}
 
	public void undo() {
		if (prevSpeed == CeilingFan.HIGH) {
			ceilingFan.high();
		} else if (prevSpeed == CeilingFan.MEDIUM) {
			ceilingFan.medium();
		} else if (prevSpeed == CeilingFan.LOW) {
			ceilingFan.low();
		} else if (prevSpeed == CeilingFan.OFF) {
			ceilingFan.off();
		}
	}
}
