import java.util.ArrayList;

public class WeatherData implements Subject {
	
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	
	public WeatherData() { // Observer ��ü���� ArrayList�� �����ϱ� ���� WeatherDataŬ������ ȣ��Ǹ� ��� ArrayList ����
		observers = new ArrayList<Observer>();
	}
	
	/********************* Subject interface�� �����ϴ� �κ� ***************************/ 
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	//Observer interface�� �� �׸�� ���� ���� ( ������ ��� ���¸� ���� )
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




