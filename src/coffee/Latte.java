package coffee;

public class Latte extends Decorator{

	public Latte(Coffee coffee) {
		super(coffee);
	}

	public void brewing(){
		super.coffee.brewing();
		System.out.print("Adding Milk ");
	}
}
