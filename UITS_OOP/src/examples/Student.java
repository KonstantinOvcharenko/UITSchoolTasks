package examples;

public class Student implements Cloneable {
	private String fullName;
	private int age;

	public String getFullName() {
		return fullName;
	}

	public void seFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String fullName, int age) {
		this.fullName = fullName;
		this.age = age;
	}

	public String toString() {
		return fullName + " " + age;
	}

	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException e) {
			throw new AssertionError("Impossible!");
		}
	}
}
