package practice.task_0_1.toys;

import practice.task_0_1.toys.toy.*;

public class GameRoom {
	private Toy[] toys;
	private int roomCost;
	ToyFactory tFactory = new ToyFactory();

	public void addToy(Toy toy) {
		Toy[] newToys = new Toy[toys.length + 1];
		System.arraycopy(toys, 0, newToys, 0, toys.length);
		newToys[newToys.length - 1] = toy;
		toys = newToys;
	}

	public void fillRoom(int amount, int budget) {
		while (true) {
			toys = new Toy[0];
			roomCost = 0;
			for (int i = 0; i < amount; i++) {
				Toy t = tFactory.createToy();
				addToy(t);
				roomCost += t.getPrice();
			}
			if (roomCost <= budget)
				return;

		}
	}

	public void showRoom() {
		for (Toy t : toys) {
			System.out.println(t.toString());
		}
		System.out.println("Стоимость игровой комнаты: " + roomCost);
	}

	public static void main(String[] args) {
		GameRoom room = new GameRoom();

		room.fillRoom(10, 1000);
		room.showRoom();
	}
}
