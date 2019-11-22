package streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThirdClassStreams {
public static void main(String[] args) {
	//IntStream.range(1, 6).forEach(System.out::print);
	//2skip interger
	IntStream.range(1, 6).skip(2).forEach(x->System.out.println(x));
	
	//3 
	System.out.println(
	IntStream.range(4,8).sum());
	System.out.println();
	
	
	//4
	Stream.of("shruthi","chintu").sorted().findFirst().ifPresent(System.out::print);
	
	//5
	
}
}
