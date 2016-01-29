package coffee;

//상속만 할 클래스
public abstract class Decorator extends Coffee{

	Coffee coffee;
	
	public Decorator(Coffee coffee){
		this.coffee = coffee;
	}
	
	@Override
	public void brewing() {
		coffee.brewing();
	}
	
	

}
