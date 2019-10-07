
public class SteamMilk extends CondimentDecorator {
	
	Beverage beverage;
	
	public SteamMilk (Beverage beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", ������ũ";
	}
	
	public double cost() {
		return .1 + beverage.cost();
	}

}
