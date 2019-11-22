package functionalinterface;
@FunctionalInterface
interface A{
//public void test();
	//public void test1(int a,int b);
	public int square(int a );
	
	
}



public class Lambda2  {
public static void main(String[] args) {
	//A a=()->System.out.println("ga");
	//a.test();
		/*
		 * A e=(a,b)->System.out.println(a+b);
		 * 
		 * e.test1(2, 9); e.test1(9, 6);
		 */
	
	//A i=a->a*a;
A i=a->{return a*a;};
	System.out.println(i.square(5));
	
}

	
}
