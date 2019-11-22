package functionalinterface;

import java.util.ArrayList;

public class MainTest {
	public static void main(String[] args) {
		ArrayList<Person> p=new ArrayList<Person>();
		p.add(new Person(1,"chintu"));
		p.add(new Person(2,"sai"));
		for (Person person : p) {
        System.out.println(person.getName());
			
		}
		
	}

}
