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
 * ��ü�� ����ȭ �����ϴٰ� �����ϴ� �������̽�
 * �ڹ� Ŭ���� ���̺귯�� ��κ��� Ŭ������ �̹� ����ȭ�� �����ϴ�.
 * marker interface : �޼ҵ�� ���q���ʰ� ǥ�ø� �ϴ� �������̽�
 *
 * ��ü�� �����ߴٰ� ����(Externalizable)�ϴ� ��
 */
class Person implements Serializable{

	String name;
	transient String age;
	transient Socket socket;
	//transient�� �̿��Ͽ� Serialization ���� ���� ���� ���� ����.
	
	public Person(String name, String age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return "�̸� =" + name + ", ���� =" + age;
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
		
		//instanceOf�� ����Ͽ� �о�� ��ü�� ����Ϸ��� ��ü�� Ÿ�԰� �������� üũ�ϴ� ���� ����.
		Person personK = (Person)ois.readObject();
		Person personL = (Person)ois.readObject();
		
		ois.close();
		
		System.out.println(personK.toString());
		System.out.println(personL.toString());
		
	}

}

//Decorator Pattern