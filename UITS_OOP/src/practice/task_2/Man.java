package practice.task_2;

import java.util.Random;

public class Man extends Human {
	private Random rand = new Random(System.currentTimeMillis());

	public Man(String first_name, String last_name, float height, float weight) {
		super(true, first_name, last_name, height, weight);
	}

	@Override
	public boolean speak(Human human) {
		System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " познакомились.");
		if (human.getSex() == false & this.getSex() == false) {
			System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " общаютс€.");
			return true;
		}
		if ((human.getSex() == false & this.getSex() == true) || (human.getSex() == true & this.getSex() == false)) {
			System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " общаютс€.");
			return true;
		}

		if (human.getSex() == true & this.getSex() == true) {
			int r = rand.nextInt(100);
			if (r < 50) {
				System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " общаютс€.");
				return true;
			} else if (r < 100) {
				System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " перестали общатьс€.");
				return false;
			}
		}

		return false;
	}

	@Override
	public boolean stand(Human human) {
		double r = rand.nextDouble();
		if (human.getSex() == false & this.getSex() == false) {
			if (r < 0.05) {
				System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " принимают друг друга.");
				return true;
			}
			System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " терпеть дру друга не могут.");
			return false;
		}
		if ((human.getSex() == false & this.getSex() == true) || (human.getSex() == true & this.getSex() == false)) {
			if (r < 0.7) {
				System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " принимают друг друга.");
				return true;
			}
			System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " терпеть дру друга не могут.");
			return false;
		}

		if (human.getSex() == true & this.getSex() == true) {
			if (r < 0.056) {
				System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " принимают друг друга.");
				return true;
			}
			System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " терпеть дру друга не могут.");
			return false;

		}

		return false;
	}

	@Override
	public boolean spendTime(Human human) {
		if (human.getHeight() < this.getHeight()) {
			float difference = 100 - (human.getHeight() / this.getHeight()) * 100;
			double r = rand.nextDouble();
			if (difference > 10) {
				if (r < 0.85) {
					System.out
							.println(this.getFirst_name() + " и " + human.getFirst_name() + " провод€т вместе врем€.");
					return true;
				}
			} else if (difference < 10) {
				if (r < 0.95) {
					System.out
							.println(this.getFirst_name() + " и " + human.getFirst_name() + " провод€т вместе врем€.");
					return true;
				}
			}
		}

		if (human.getHeight() > this.getHeight()) {
			float difference = 100 - (this.getHeight() / human.getHeight()) * 100;
			double r = rand.nextDouble();
			if (difference > 10) {
				if (r < 0.85) {
					System.out
							.println(this.getFirst_name() + " и " + human.getFirst_name() + " провод€т вместе врем€.");
					return true;
				}
			} else if (difference < 10) {
				if (r < 0.95) {
					System.out
							.println(this.getFirst_name() + " и " + human.getFirst_name() + " провод€т вместе врем€.");
					return true;
				}
			}
		}
		System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " не хот€т проводить врем€ вместе.");
		return false;
	}

	@Override
	public Human haveRelations(Human human) {
		if (speak(human) == true && stand(human) == true && spendTime(human) == true) {
			if (human.getSex() != this.getSex()) {
				System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " завод€т отношени€.");
				return human.giveBirth(this);
			}
		}
		System.out.println(this.getFirst_name() + " и " + human.getFirst_name() + " расстаютс€.");
		return null;
	}

	@Override
	public Human giveBirth(Human h) {
		System.out.println("Ќевозможно родить ребенка!");
		return null;
	}
}
