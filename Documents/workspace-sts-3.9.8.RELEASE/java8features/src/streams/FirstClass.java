package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import javax.print.DocFlavor.STRING;

public class FirstClass {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(4);
		l.add(7);
		l.add(10);
		System.out.println(l);
		List<Integer> p=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		List<Integer> p1=l.stream().filter(i->i>=4).collect(Collectors.toList());
		System.out.println(p);
		System.out.println(p1);
		List<Integer> marks=new ArrayList<>();
		 marks.add(90);
		 marks.add(15);
		 marks.add(20);
		 System.out.println(marks);
		 List<Integer> u= marks.stream().map(m->m+10).collect(Collectors.toList());
		 List<Integer> sort=marks.stream().sorted().collect(Collectors.toList());
		 long  failedstud= marks.stream().filter(d->d<=35).count();
		 //customize sorting
		 List<Integer> decsorted=marks.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
		 System.out.println(u);
		 System.out.println("sort:"+sort);
		 System.out.println("failedstud:"+failedstud);
		 System.out.println(decsorted);
		 
		 
		 List<Integer> t=new ArrayList<>();
		 t.add(89);
		 t.add(90);
		 t.add(56);
		 System.out.println(t);
		 int min=t.stream().min((a1,a2)->a1.compareTo(a2)).get();
		 System.out.println("min:" +min);
		 int max=t.stream().max((a1,a2)->a1.compareTo(a2)).get();
		 System.out.println("max:" +max);
		
	}

}
