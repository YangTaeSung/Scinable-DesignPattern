/*
 * 
 * Head First Design Pattern
 * Singleton Pattern
 * 
 */


public class Singleton { 
	// 애초에 인스턴스를 만들어놓기 ( DCL과 더불어 중복된 인스턴스의 생성 방지 )
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
