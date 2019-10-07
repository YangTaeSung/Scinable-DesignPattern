
public class StarbuzzCoffee {

	public static void main(String args[]) {
		
		// �ƹ��͵� ÷������ ���� ���������� �ֹ�
		Beverage beverage = new Espresso(); // ���ڷ����ͷ� �������� ���� ������� ����������
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		// ��ī 2���� ����ũ���� �߰��� ��ũ�ν�Ʈ �ֹ�
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2); // ��ī ���ڷ����ͷ� ���α�
		beverage2 = new Mocha(beverage2); // ��ī ���ڷ����ͷ� ���α�
		beverage2 = new Whip(beverage2); // ����ũ�� ���ڷ����ͷ� ���α�
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		// ����,��ī,����ũ���� �߰��� �Ͽ콺���� �ֹ�
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
