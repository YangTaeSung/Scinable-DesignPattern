/*
 * 
 * Head First Design Pattern
 * Singleton Pattern
 * 
 */

public class Singleton {
	private static Singleton uniqueInstance;
 
	// other useful instance variables here
 
	private Singleton() {}
 
	// 두 스레드의 동기화가 안되면 여러개의 인스턴스를 생성할 수 있기 때문에 synchronized 사용
	// synchronized를 사용하면 한 스레드가 메소드 사용을 끝낼때까지 다른 스레드는 기다려야 함.
	public static synchronized Singleton getInstance() {
		
		if (uniqueInstance == null) {
			uniqueInstance = new Singleton();
		}
		return uniqueInstance;
	}
 
	// other useful methods here
	public String getDescription() {
		return "I'm a thread safe Singleton!";
	}
}
