package practice.task_0_1.toys;

import java.util.Random;

import practice.task_0_1.toys.toy.*;

public class ToyFactory {
	private static Random rand;
	static {
		rand = new Random(System.currentTimeMillis());
	}

	private static String[] types = { "машина", "кукла", "м€ч", "кубик" };
	private static String[] sizes = { "маленький", "средний", "большой" };
	private static int[] ages = { 3, 6, 14 };

	public Toy createToy() {
		Toy toy = null;
		switch (types[rand.nextInt(4)]) {
		case "машина":
			String sz = sizes[rand.nextInt(3)];
			int ag = ages[rand.nextInt(3)];
			int prc = rand.nextInt(100) + 100 + ag;
			return new Car("машина", sz, ag, prc);
		case "кукла":
			String sz1 = sizes[rand.nextInt(3)];
			int ag1 = ages[rand.nextInt(3)];
			int prc1 = rand.nextInt(100) + 50 + ag1;
			return new Doll("кукла", sz1, ag1, prc1);
		case "м€ч":
			String sz2 = sizes[rand.nextInt(3)];
			int ag2 = ages[rand.nextInt(3)];
			int prc2 = rand.nextInt(50) + 20 + ag2;
			return new Ball("м€ч", sz2, ag2, prc2);
		case "кубик":
			String sz3 = sizes[rand.nextInt(3)];
			int ag3 = ages[rand.nextInt(3)];
			int prc3 = rand.nextInt(40) + 15 + ag3;
			return new Ball("м€ч", sz3, ag3, prc3);
		default:
			System.out.println("“ип игрушки не выбран!");
			return toy;
		}
	}
}
