import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() { // Observer 객체들을 ArrayList에 저장하기 위해 WeatherData클래스가 호출되면 즉시 ArrayList 생성
		observers = new ArrayList<Observer>();
	}
	
	/********************* Subject interface를 구현하는 부분 ***************************/ 
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	//Observer interface의 각 항목들 값을 저장 ( 각각의 기상 상태를 저장 )
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer) observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
		
	}
	
	/****************************************************************************/
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements (float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
	
}




