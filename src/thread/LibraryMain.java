package thread;

import java.util.ArrayList;

class Shelf{
	ArrayList<String> list;
	
	public Shelf(){
		list = new ArrayList<String>();
		
		list.add("�¹���1");
		list.add("�¹���2");
		list.add("�¹���3");
	}
	
	public synchronized String lendBook() throws InterruptedException{
		
		Thread t = Thread.currentThread();
		while (list.size() <= 0){
			System.out.println(t.getName() + " is waiting start");
			wait();
			System.out.println(t.getName() + " is waiting end");
		}
		String title = list.remove(list.size()-1);
		System.out.println(t.getName() + "�� " + title + "�� �뿩�߽��ϴ�.");
		return title;
	}
	
	public synchronized void returnBook(String title){
		
		Thread t = Thread.currentThread();
		list.add(title);
		notifyAll();
		System.out.println(t.getName() + "�� " + title + "�� �ݳ��߽��ϴ�.");
	}
}

class Student extends Thread{
	
	public void run(){
		
		try {

			String title = LibraryMain.kookminShelf.lendBook();
			if(title == null) return;
			Thread.sleep(5000);
			LibraryMain.kookminShelf.returnBook(title);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class LibraryMain {
	
	public static Shelf kookminShelf = new Shelf();
	
	public static void main(String[] args){
		
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		Student st4 = new Student();
		Student st5 = new Student();
		Student st6 = new Student();
		
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();
		st6.start();
	}
	
}
