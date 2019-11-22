package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PraticeStreams {

	public static void main(String[] args) {
		/*List<String> s=Arrays.asList("pavan","chintu");
		List<String> filter=s.stream().filter(k->k.startsWith("c")).collect(Collectors.toList());
	//filter.forEach(System.out::println);
	}*/
List<Person> per=Arrays.asList(new Person(1,"shruthi"),
                               new Person(2,"chikki"));

String p=per.stream().filter(d->"chikki".equals(d.getName())).map(Person::getName).findAny().orElse(null);
System.out.println(p);
	}
}
