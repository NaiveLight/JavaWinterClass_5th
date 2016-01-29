package thread;

class Bank{
	int money = 10000;
	
	public void saveMoney(int money){
		int m = this.money;
		
		try {
			System.out.println("sleep");
			Thread.sleep(3000);
			System.out.println("wake");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.money = m + money;
	}
	
	public void minusMoney(int money){
		int m = this.money;
		
		try {
			System.out.println("sleep");
			Thread.sleep(200);
			System.out.println("wake");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.money = m - money;
	}

}

class Park extends Thread{
	
	public void run(){
		synchronized(SyncMain.myBank){
			SyncMain.myBank.saveMoney(3000);
			System.out.println("saveMoney(3000) ->" + SyncMain.myBank.money);
		}
	}
}

class ParkWife extends Thread{
	
	public void run(){
		synchronized(SyncMain.myBank){
			SyncMain.myBank.minusMoney(1000);
			System.out.println("minusMoney(1000) ->" + SyncMain.myBank.money);
		}
	}
}

public class SyncMain {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		
		Park p = new Park();
		p.start();
		try {
			p.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		ParkWife pw = new ParkWife();
		pw.start();
	}

}
