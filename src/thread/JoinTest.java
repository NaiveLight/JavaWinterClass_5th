package thread;

public class JoinTest extends Thread{
	
	int start;
	int end;
	int sum;
	
	public JoinTest(int start, int end){
		this.start = start;
		this.end = end;
	}
	
	public void run(){
		for (int i = start; i <= end; i++){
			sum += i;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t = Thread.currentThread();
		System.out.println(t);
		JoinTest jt1 = new JoinTest(1, 50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {
			jt1.join();
			jt2.join(); 
			//join을 걸면 각 Thread가 꿑난 뒤 반환?
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int lastTotal = jt1.sum + jt2.sum;
		
		System.out.println(lastTotal);
		System.out.println(jt1.sum);
		System.out.println(jt2.sum);
		
	}

}
