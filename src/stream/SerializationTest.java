package stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;

/*
 * Serializable
 * 객체를 직렬화 가능하다고 선언하는 인터페이스
 * 자바 클래스 라이브러리 대부분의 클래스는 이미 직렬화가 가능하다.
 * marker interface : 메소드는 구혆지않고 표시만 하는 인터페이스
 *
 * 객체를 저장했다가 복원(Externalizable)하는 것
 */
class Person implements Serializable{

	String name;
	transient String age;
	transient Socket socket;
	//transient를 이용하여 Serialization 하지 않을 것을 설정 가능.
	
	public Person(String name, String age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "이름 =" + name + ", 나이 =" + age;
	}
}

public class SerializationTest {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		FileOutputStream fos = new FileOutputStream("serial.dat");
		FileInputStream fis = new FileInputStream("serial.dat");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person personKim = new Person("Kim", "20");
		Person personLee = new Person("Lee", "25");

		oos.writeObject(personKim);
		oos.writeObject(personLee);
		
		oos.close();
		
		//instanceOf를 사용하여 읽어온 객체가 사용하려는 객체의 타입과 동일한지 체크하는 것이 좋다.
		Person personK = (Person)ois.readObject();
		Person personL = (Person)ois.readObject();
		
		ois.close();
		
		System.out.println(personK.toString());
		System.out.println(personL.toString());
		
	}

}

//Decorator Pattern