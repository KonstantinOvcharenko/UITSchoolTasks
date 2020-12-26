package examples.NestedInner;

public class Inner {
	public static void main(String[] args) {
		Test a = new Test();
		a.show();
		Test.Mynested a1 = new Test.Mynested();
		a1.nestedshow();
		Test.MyInner a2 = a.new MyInner();
		Test.MyInner a3 = a.new MyInner();
		a2.innershow();
		a3.innershow();
	}
}
