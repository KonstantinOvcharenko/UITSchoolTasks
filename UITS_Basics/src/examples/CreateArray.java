package examples;

public class CreateArray {
	public static void main(String[] args) {
		int[] price = new int[10];
		int[] rooms = new int[] { 1, 2, 3 };
		Item[] items = new Item[10];
		Item[] undefinedItems = new Item[] { new Item(1), new Item(2) };
	}
}

class Item {
	public Item(int i) {
	}
}
