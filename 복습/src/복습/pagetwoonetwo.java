package ����;

class A{
	void f() {
		System.out.println("a");
	}
}

class B extends A{
	void f() {
		System.out.println("b");
	}
}
public class pagetwoonetwo {
	public static void main(String[] args) {
		A a = new A();
		a.f();
		
		B b = new B();
		b.f();
		
		A c = new B();
		c.f();
	}

}
