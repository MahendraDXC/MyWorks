package interfaces;
interface A{
	int i=2000;
	String s="---interface A ---";
	void m1();
	void m2();
	void m3();
}
class B implements A{
	public void m1() {
		System.out.println("m1-A");
	}
	public void m2() {
		System.out.println("m2-A");
	}
	public void m3() {
		System.out.println("m3*A");
	}
	public void m4() {
		System.out.println(i+i+s+"----m4-B----------");
	}
}

public class interface1 {

	public static void main(String[] args) {
	  B b1=new B();
	  b1.m1();
	  b1.m2();
	  b1.m3();
	  System.out.println("-----------------------------m4 method-----------------------");
	  b1.m4();
	  
	  System.out.println(A.i+"    "+A.s);
	 // A b2=new A();
	  A b2=new B();
	  b2.m1();
	  b2.m2();
	  b2.m3();
	  System.out.println(A.i+B.i+b1.i+b2.i+" "+A.s+B.s+b1.s+b2.s);

	}

}
