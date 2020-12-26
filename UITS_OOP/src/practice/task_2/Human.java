package practice.task_2;

public abstract class Human {
	private boolean sex;
	private String first_name;
	private String last_name;
	private float height;
	private float weight;

	public abstract boolean speak(Human human);

	public abstract boolean stand(Human human);

	public abstract boolean spendTime(Human human);

	public abstract Human haveRelations(Human human);

	public abstract Human giveBirth(Human man);

	public Human(boolean sex, String first_name, String last_name, float height, float weight) {
		this.sex = sex;
		this.first_name = first_name;
		this.last_name = last_name;
		this.height = height;
		this.weight = weight;
	}

	public boolean getSex() {
		return sex;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return first_name + " " + last_name + ", рост " + height + "см, вес " + weight+" кг";
	}
}
