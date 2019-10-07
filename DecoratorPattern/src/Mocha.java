// 구상 데코레이터
public class Mocha extends CondimentDecorator {
	
	Beverage beverage;
	
	// 데코레이터의 생성자에 감싸고자 하는 음료 객체를 전달하는 방식
	public Mocha (Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", 모카";
	}
	
	// 음료 가격에 모카를 추가한 가격을 리턴
	public double cost() {
		return .20 + beverage.cost();
	}

}
