// ���� ���ڷ�����
public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	// ���ڷ������� �����ڿ� ���ΰ��� �ϴ� ���� ��ü�� �����ϴ� ���
	public Mocha (Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", ��ī";
	}
	
	// ���� ���ݿ� ��ī�� �߰��� ������ ����
	public double cost() {
		return .20 + beverage.cost();
	}

}
