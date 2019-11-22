package streams;

import java.util.Arrays;
import java.util.List;

public class CovertStreamOfPersonToString {
public static void main(String[] args) {
	List<Person> p=Arrays.asList(new Person(1,"shruthi"),new Person(2,"yasam"));
	String k=p.stream().filter(d->"yasam".equals(d.getName())).map(Person::getName).findAny().orElse(null);
	System.out.println(k);
	
}
}
