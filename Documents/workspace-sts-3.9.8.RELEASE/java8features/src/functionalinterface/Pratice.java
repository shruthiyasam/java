package functionalinterface;
@FunctionalInterface
interface I{
	//public void test(int a,int b);
	public int square(int a);
}

public class Pratice {
	public static void main(String[] args) {
		/*
		 * I i=(a,b)->System.out.println(a+b); i.test(3, 9);
		 * 
		 */
		I i=(a)-> a*a;
		System.out.println(i.square(4));
	}
	

}
