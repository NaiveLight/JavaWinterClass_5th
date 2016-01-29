package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		
		Coffee kenya = new KenyaAA();
		kenya.brewing();
		System.out.println("");
		
		Latte kenyaLatte = new Latte(kenya);
		kenyaLatte.brewing();
		System.out.println("");
				
		Mocha kenyaMochaLatte = new Mocha(kenyaLatte);
		kenyaMochaLatte.brewing();
		System.out.println("");
		
		Mocha kenyaMocha = new Mocha(kenya);
		kenyaMocha.brewing();
	}
	

}
