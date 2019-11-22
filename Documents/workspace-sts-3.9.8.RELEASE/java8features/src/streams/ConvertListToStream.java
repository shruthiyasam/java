package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertListToStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> n=new ArrayList<>();
		n.add(4);
		n.add(8);
		n.add(9);
		Stream<Integer> s=n.stream();
		System.out.println(s);
		
		Integer[] k= {4,6,7};
		Stream<Integer> p=Arrays.stream(k);
		System.out.println(p.toString());
		

	}

}
