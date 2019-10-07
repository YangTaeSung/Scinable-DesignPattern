/*
 * 
 * Head First Design Patterns
 * Decorator Patterns
 * 
 * 
 * */


// 眠惑 备己夸家
public abstract class Beverage {
	String description = "力格 绝澜";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
