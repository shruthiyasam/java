package streams;

import java.util.stream.Stream;

public class IterateMethodStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Stream.iterate(1, n->n+1).limit(10).forEach(System.out::println);
		//Stream<Long> s=Stream.iterate(1L, n->n*10).limit(4);
		//s.forEach(System.out::println);
		
		Stream.iterate(1,p->p+1).filter(p->p%10==0).limit(4).forEach(System.out::println);
		Stream.iterate(1,p->p+1).limit(4).forEach(System.out::println);
				
		//Stream.iterate(2, n->n+10).filter(IterateMethodStream::isOdd).limit(2).forEach(System.out::println);
		//Stream.iterate(2, n->n+10).limit(2).forEach(System.out::println);
		
	}
public  static boolean isOdd(long number) {
	if(number%2==0) {
		return false;
	}
	return true;
}
}
