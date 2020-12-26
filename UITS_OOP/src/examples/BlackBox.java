package examples;

public class BlackBox {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + b;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlackBox other = (BlackBox) obj;
		if (a != other.a)
			return false;
		if (b != other.b)
			return false;
		return true;
	}

	int a;
	int b;

	BlackBox(int varA, int varB) {
		a = varA;
		b = varB;
	}
}
