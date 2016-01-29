package thread;

class Outer{
	
	public Runnable getRunnable(){
//		//InnerClass를 사용하여 Runnable 객체 생성 후 return
//		//local Inner Class
//		class Command implements Runnable{
//
//			@Override
//			public void run() {
//				System.out.println("run()");
//			}
//			
//		}
//		
//		return new Command();
		//final으로 정의 된다.
		int i = 20;
		
		//anonymous class 
		return new Runnable() {
			
			@Override
			public void run() {
				System.out.println("run()");
				System.out.println(i);
				//i = 100;
			}
		};
		
		
		
	}
	
	class Inner{
		//Outer클래스의 context안에 생성된다.	
		//안드로이드 화면 handler가 모두 InnerClass
	}
}

public class InnerTest {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outer = new Outer();
		
		Runnable runner = outer.getRunnable();
		runner.run();
	}

}
