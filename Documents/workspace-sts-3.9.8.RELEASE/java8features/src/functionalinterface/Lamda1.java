package functionalinterface;
interface Test{
public abstract void m1();
}
public class Lamda1 {
public static void main(String[] args) {
	System.out.println("main");
	Test t=new Test() {

		@Override
		public void m1() {
			// TODO Auto-generated method stub
			System.out.println("inner");
		}

		
};
t.m1();
}
}
