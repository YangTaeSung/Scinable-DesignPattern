
public abstract class PizzaStore {
 
	abstract Pizza createPizza(String item);
 
	public Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type); // NYStylePizzaStore | ChicagoStylePizzaStore로 이동하여 종류에 맞는 피자 생성
		System.out.println("--- Making a " + pizza.getName() + " ---"); // 출력창의 첫 메세지
		pizza.prepare(); // Pizza 클래스의 메소드들 
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
}
