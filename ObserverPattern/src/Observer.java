
public interface Observer {
	
	//기상 정보가 변경되었을 떄 옵저버에게 전달되는 상태값들 temperature, humidity, pressure
	public void update(float temp, float humidity, float pressure);

}
