
public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type); // NYStylePizzaStore | ChicagoStylePizzaStore�� �̵��Ͽ� ������ �´� ���� ����
		System.out.println("--- Making a " + pizza.getName() + " ---"); // ���â�� ù �޼���
		pizza.prepare(); // Pizza Ŭ������ �޼ҵ�� 
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
