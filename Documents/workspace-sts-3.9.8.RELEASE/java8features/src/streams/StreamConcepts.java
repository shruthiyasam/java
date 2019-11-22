package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamConcepts {

	public static void main(String[] args) {
		 List<Integer> t=new ArrayList<>();
		 t.add(89);
		 t.add(90);
		 t.add(56);
		 System.out.println(t);
		 t.stream().forEach(System.out::println);
		 t.stream().forEach(i->System.out.println("square"+i*i));
		 t.stream().forEach(i->System.out.println("add:"+i+i+i));
		 
		 
		
		/*
		 * Consumer<Integer> c= i->{ System.out.println("square:"+i*i); };
		 * t.stream().forEach(c);
		 */
		 
		 //toArray()->to convert stream of objects in to array
		 
		 List<Integer> s=new ArrayList<>();
		 s.add(76);
		 s.add(67);
		 s.add(56);
		 System.out.println(s);
		 Integer[] i=s.stream().toArray(Integer[]::new);
		 
		 for (Integer inte : i) {
			System.out.println(inte);
		 
	}
		//where were group of values are their we can go for streams
		 Stream<Integer> p=Stream.of(5,66,5,88);
		 p.forEach(System.out::println);
	}

	
}
