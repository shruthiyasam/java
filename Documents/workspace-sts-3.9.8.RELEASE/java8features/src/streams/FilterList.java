package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterList {
	public static void main(String[] args) {
		List<String> s=Arrays.asList("shruthi","chikkki");
		//coverting list to streams
		List<String> filterlist=s.stream().filter(name->name.startsWith("s")).collect(Collectors.toList());
		filterlist.forEach(System.out::print);
	//	===========================================================================
	}
	List<Person> per=Arrays.asList(new Person(1,"shruthi"),
            new Person(2,"chikki"));
Person p=per.stream().filter(s->"chikki".equals(s.getName())).findAny().orElse(null);


}
