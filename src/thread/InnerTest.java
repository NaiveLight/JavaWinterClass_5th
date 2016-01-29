package thread;

class Outer{
	
	public Runnable getRunnable(){
//		//InnerClass�� ����Ͽ� Runnable ��ü ���� �� return
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
		//final���� ���� �ȴ�.
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
		//OuterŬ������ context�ȿ� �����ȴ�.	
		//�ȵ���̵� ȭ�� handler�� ��� InnerClass
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
