/* 
* 
* Head First Design Patterns
* [strategy pattern]
* �˰����� �����ϰ� ������ ĸ��ȭ�Ͽ� ��ȯ�ؼ� ����� �� �ֵ��� �����.
* strategy pattern�� Ȱ���ϸ� �˰����� ����ϴ� Ŭ���̾�Ʈ�ʹ� ���������� �˰����� ������ �� �ִ�.
* 
*/
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("Every duck float on water. Fake duck too.");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
