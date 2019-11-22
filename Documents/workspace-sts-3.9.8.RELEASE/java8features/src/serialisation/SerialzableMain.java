package serialisation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialzableMain {
	public static void main(String[] args) throws IOException {
		Person p=new Person();
		p.setId(1);
		p.setName("shruthi");
		FileOutputStream fos;
		try {
			fos=new FileOutputStream("g://person.ser");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(p);
		oos.close();
		fos.close();
	
	}
	catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
