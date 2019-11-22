package streams;

import java.util.Arrays;
import java.util.List;

public class PersonMainStream {

	public static void main(String[] args) {
		/*List<Person> p=Arrays.asList(new Person(1,"shruthi"),
				(new Person(2,"yasam")));
		
				Person pp=p.stream().filter(s->"shruthi".equals(s.getName())).findAny().orElse(null);
				

				System.out.println(pp);

	}
	*/
	List<Person> s=Arrays.asList(new Person(1,"shruthi"),
				(new Person(2,"yasam")));
	Person y=s.stream().filter(p->"yasam".equals(p.getName())&& 2==p.getId()).findAny().orElse(null);
	System.out.println(y);

}
}
