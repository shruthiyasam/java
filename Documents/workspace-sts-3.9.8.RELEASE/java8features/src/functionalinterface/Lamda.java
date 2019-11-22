package functionalinterface;
@FunctionalInterface
interface Draw{
	public abstract void drwing();
	//public void abc();
	public default void m1() {
		System.out.println("m1");
	}
	public default void m2() {
		System.out.println("m2");
	}
	public static void  m3() {
		System.out.println("stactic 1");
	}
	public static void  m4() {
		System.out.println("stactic 4");
	}
	public static void  m7() {
		System.out.println("stactic 9");
	}
	public class Lamda implements Draw{
		public static void main(String[] args) {
			Draw d= new Lamda();
			d.m1();
			d.m2();
			Draw.m3();
			Draw.m4();
			Draw.m7();
		}

		@Override
		public void drwing() {
			System.out.println("draing");
			
		}
		
	}
}



