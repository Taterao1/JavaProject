package OOPS;

public class ChildClass extends ParentClass {
	public static void c1() {
		System.out.println("c1 method");
	}

	public String c2() {
		System.out.println("c2 method");
		return null;
	}

	public void c3() {
		System.out.println("c3 method");
	}

	public void c4() {
		System.out.println("c4 method");
	}

	public static void main(String[] args) {

		// ParentClass obj=new ParentClass();
		ParentClass obj = new ChildClass();
		obj.c2();

	}

}
