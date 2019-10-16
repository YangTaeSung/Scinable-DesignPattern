/*
 * 
 * Head First Design Pattern
 * Singleton Pattern
 * 
 */


public class Singleton { 
	// ���ʿ� �ν��Ͻ��� �������� ( DCL�� ���Ҿ� �ߺ��� �ν��Ͻ��� ���� ���� )
	private static Singleton uniqueInstance = new Singleton();
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		return uniqueInstance;
	}
	
	// other useful methods here
	public String getDescription() {
		return "I'm a statically initialized Singleton!";
	}
}
