package examples;

public class Test {
	int a, b;
	int i;

	Test(int i) {
		this.i = i;
	}

	Test(int a, int b) {
		this.a = a;
		this.b = b;
	}

	boolean equals(Test o) {
		if (o.a == a && o.b == b)
			return true;
		else
			return false;
	}

	void meth(Test o) {
		o.a *= 2;
		o.b /= 2;
	}

	void meth(int a, int b) {
		a *= 2;
		b *= 2;
	}

	Test incrByTen() {
		Test tmp = new Test(i + 10);
		return tmp;
	}
}
