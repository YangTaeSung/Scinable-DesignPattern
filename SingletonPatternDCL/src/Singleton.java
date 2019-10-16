/*
 * 
 * Head First Design Pattern
 * Singleton Pattern
 * DCL(Double-checking Locking)
 */

//
// Danger!  This implementation of Singleton not
// guaranteed to work prior to Java 5 ( JVM : Java5 �̻�, JAVA 1.5 �̻󿡼� ��� ���� )
//

public class Singleton {
	
	// DCL ù��° checking - volatile ���
	// volatile Ű���带 ����ϸ� ��Ƽ�������� ������ uniqueInstance ������ Singleton �ν��Ͻ��� 
	// �ʱ�ȭ�Ǵ� ������ �ùٸ��� ����ǵ��� �� �� �ִ�.
	private volatile static Singleton uniqueInstance; 
	
 
	private Singleton() {}
 
	public static Singleton getInstance() {
		if (uniqueInstance == null) {
			synchronized (Singleton.class) { 
				// �� �������� ����ȭ�� �ȵǸ� �������� �ν��Ͻ��� ������ �� �ֱ� ������ synchronized ���
				// synchronized�� ����ϸ� �� �����尡 �޼ҵ� ����� ���������� �ٸ� ������� ��ٷ��� ��.
				if (uniqueInstance == null) {
					uniqueInstance = new Singleton();
				}
			}
		}
		return uniqueInstance;
	}
}
