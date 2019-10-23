
public class CeilingFan {
	// CeilingFan 클래스에서 선풍기의 속도를 나타내는 상태를 저장
	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;
 
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
  
	public void high() {
		speed = HIGH;
		System.out.println(location + " ceiling fan is on high");
	} 
 
	public void medium() {
		speed = MEDIUM;
		System.out.println(location + " ceiling fan is on medium");
	}
 
	public void low() {
		speed = LOW;
		System.out.println(location + " ceiling fan is on low");
	}
  
	public void off() {
		speed = OFF;
		System.out.println(location + " ceiling fan is off");
	}
  
	public int getSpeed() {
		// getSpeed 메소드를 사용하여 현재 속도를 얻을 수 있다.
		return speed;
	}
}
