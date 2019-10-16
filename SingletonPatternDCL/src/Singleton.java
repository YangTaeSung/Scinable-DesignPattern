/*
 * 
 * Head First Design Pattern
 * Singleton Pattern
 * DCL(Double-checking Locking)
 */

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5 ( JVM : Java5 이상, JAVA 1.5 이상에서 사용 가능 )
//

public class Singleton {
	
	// DCL 첫번째 checking - volatile 사용
	// volatile 키워드를 사용하면 멀티스레딩을 쓰더라도 uniqueInstance 변수가 Singleton 인스턴스로 
	// 초기화되는 과정이 올바르게 진행되도록 할 수 있다.
	private volatile static Singleton uniqueInstance; 
	
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) { 
				// 두 스레드의 동기화가 안되면 여러개의 인스턴스를 생성할 수 있기 때문에 synchronized 사용
				// synchronized를 사용하면 한 스레드가 메소드 사용을 끝낼때까지 다른 스레드는 기다려야 함.
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
