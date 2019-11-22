package deserialisation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonMain {
	public static void main(String[] args) throws FileNotFoundException {
		Person p=new Person();
		FileInputStream fis=new FileInputStream("g://person.dser");
		ObjectInputStream ois;
		try {
			ois = new ObjectInputStream(fis);
			ois.close();
			fis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
