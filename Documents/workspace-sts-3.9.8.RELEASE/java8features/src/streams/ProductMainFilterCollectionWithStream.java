package streams;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

import org.omg.CORBA.OMGVMCID;

public class ProductMainFilterCollectionWithStream {
	public static void main(String[] args) {
		List<Product> p=Arrays.asList(new Product(1,"sumsung",9000),
				new Product(2,"nokia",8000),
				new Product(3,"jio",7000));
		
		List<Product> pl=p.stream().filter(s->s.getPrice()<9000).collect(Collectors.toList());
		Product k=p.stream().filter(s->"nokia".equals(s.getName())).findAny().orElse(null);
		
		String pl2=p.stream().filter(s->"nokia".equals(s.getName())).map(Product::getName).findAny().orElse(null);
		
		long l=p.stream().filter(s->s.getPrice()<9000).count();
		
		Integer totalprice=p.stream().map(h->h.getPrice()).reduce( 0,(sum,price)->sum+price);
		
		LongSummaryStatistics ls= p.stream().collect(Collectors.summarizingLong(v->v.getPrice()));
		
        Product max=p.stream().max((a1,a2)->a1.getPrice()>a2.getPrice()? 1:-1).get();
        System.out.println("max  "+max);
        
        Product min=p.stream().min((a1,a2)->-a1.getPrice()<a2.getPrice()?1:-1).get();
        
		System.out.println("min  "+min);
		System.out.println("ls  "+ls);
		pl.forEach(System.out::println);
		System.out.println(k);
		System.out.println(pl2);
		System.out.println(l);
		System.out.println("totalprice:" +totalprice);
				
	}

}
