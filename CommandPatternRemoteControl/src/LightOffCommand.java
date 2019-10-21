
public class LightOffCommand implements Command {
	Light light;
	
	public LightOffCommand(Light light) {
		this.light = light;
	}
	
	// LightOffCommand는 리시버를 다른 메소드(off()메소드)하고 결합시킨다는 점을 제외하면 LightOnCommand하고 똑같은 식으로 작동
	public void execute() { 
		light.off();
	}
}
