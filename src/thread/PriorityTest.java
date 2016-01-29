package thread;

public class PriorityTest extends Thread{
	
	public void run(){
		
//		Thread t = Thread.currentThread();
//		System.out.println(t + "start");
//		for (int i = 0; i < 10000; i++){
//			i += 1;
//			try {
//				Thread.sleep(1);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println(t + "end");
		
		for(int i = 0; i < 100; i++){
			System.out.print(i);
		}
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("interrupted");
		}
		
		System.out.println("\nwake up");
	}

	public static void main(String[] args) {

//		for (int i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++){
//			
//			PriorityTest test = new PriorityTest();
//			test.setPriority(i);
//			test.start();
//			
//		}
		
		PriorityTest test = new PriorityTest();
		test.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.interrupt();
		
		System.out.println("\nmain end");
	}

}
