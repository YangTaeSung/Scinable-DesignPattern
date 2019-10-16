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
 
	// �� �������� ����ȭ�� �ȵǸ� �������� �ν��Ͻ��� ������ �� �ֱ� ������ synchronized ���
	// synchronized�� ����ϸ� �� �����尡 �޼ҵ� ����� ���������� �ٸ� ������� ��ٷ��� ��.
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
