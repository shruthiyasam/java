package functionalinterface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Collections  {
	public static void main(String[] args) {
		//List<String> l=new ArrayList<>();
		TreeSet<String> l=new TreeSet<>((s1,s2)->s1.compareTo(s2));
		l.add("zi");
		l.add("poy");
		l.add("di");
		TreeSet<Integer> s=new TreeSet<>((r1,r2)->r1-r2);
		s.add(90);
		s.add(50);
		s.add(60);
		System.out.println(l);
		System.out.println(s);
		List<String> a=new ArrayList<>();
		a.add("yasamchintu");
		a.add("chintu");
		a.add("rani");
		System.out.println("before sorting :"+a );
		java.util.Collections.sort(a,(a1,a2)->a1.compareTo(a2));
		
		System.out.println("after sorting :"+a);
		
		
		
		
	}

}
