package streams;

import java.util.ArrayList;
import java.util.List;

public class BookMain {
	public static void main(String[] args) {
		List<Book> l=new ArrayList<>();
		l.add(new Book("aaa","f",34));
		l.add(new Book("bbb","m",67));
		//Integer sum=l.stream().map(Book::getName).filter(name->name.getName()=="f").reduce(0,Integer::sum);
				
	}

}
