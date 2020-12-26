package examples;

public class Aspirant extends Student {
	private String workName;

	public Aspirant(String fullname, int age, String workName) {
		super(fullname, age);
		this.workName = workName;
	}

	public void setWorkName(String workName) {
		this.workName = workName;
	}

	public String getWorkName() {
		return workName;
	}

	public String toString() {
		return getFullName() + " " + getAge() + " " + workName;
	}
}
