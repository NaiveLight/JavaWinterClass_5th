package coffee;

public class Mocha extends Decorator{

	public Mocha(Coffee coffee) {
		super(coffee);
	}
	
	public void brewing(){
		super.coffee.brewing();
		System.out.print("Adding Mocha Syrup"
				+ " ");
	}

}
