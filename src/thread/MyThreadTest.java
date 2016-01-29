package thread;

class MyThread /*extends Thread*/ implements Runnable{
	//run ±¸Çö
	public void run(){
		for (int i = 0; i < 200; i++){
			System.out.print(i + "\t");
		}
	}
	
}

public class MyThreadTest {

	public static void main(String[] args) {
		
		System.out.println("main start");
		
//		MyThread th1 = new MyThread();
//		MyThread th2 = new MyThread();
//		
//		
//		th1.start();
//		th2.start();
		
		MyThread runnable = new MyThread();

		Thread th1 = new Thread(runnable);
		Thread th2 = new Thread(runnable);
		
		th1.start();
		th2.start();
		
		Thread t = Thread.currentThread();
		System.out.println(t);
	}

}
