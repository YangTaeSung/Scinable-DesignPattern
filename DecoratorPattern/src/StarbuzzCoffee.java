
public class StarbuzzCoffee {

	public static void main(String args[]) {
		
		// 아무것도 첨가하지 않은 에스프레소 주문
		Beverage beverage = new Espresso(); // 데코레이터로 감싸지지 않은 구성요소 에스프레소
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		// 모카 2개와 휘핑크림을 추가한 다크로스트 주문
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2); // 모카 데코레이터로 감싸기
		beverage2 = new Mocha(beverage2); // 모카 데코레이터로 감싸기
		beverage2 = new Whip(beverage2); // 휘핑크림 데코레이터로 감싸기
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		// 두유,모카,휘핑크림을 추가한 하우스블랜드 주문
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}
