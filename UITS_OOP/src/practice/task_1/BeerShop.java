package practice.task_1;

public class BeerShop {
	private Beer[] beerbox;

	public BeerShop() {
		beerbox = new Beer[0];
	}

	public void Add(Beer b) {
		Beer[] newBox = new Beer[beerbox.length + 1];
		System.arraycopy(beerbox, 0, newBox, 0, beerbox.length);
		newBox[newBox.length - 1] = b;
		beerbox = newBox;
	}

	public int Count() {
		return beerbox.length;
	}

	public Beer getBeer(int index) {
		return beerbox[index];
	}

	public void sortByPrice() {
		for (int barrier = 0; barrier < beerbox.length - 1; barrier++) {
			for (int index = barrier + 1; index < beerbox.length; index++) {
				if (beerbox[barrier].getPrice() > beerbox[index].getPrice()) {
					Beer tmp = beerbox[barrier];
					beerbox[barrier] = beerbox[index];
					beerbox[index] = tmp;
				}
			}
		}
	}

	public void showBeer() {
		System.out.println("����������� ��������: ");
		for (Beer b : beerbox) {
			System.out.println(b.toString());
		}
	}

	public static void main(String[] args) {
		BeerShop shop = new BeerShop();
		shop.Add(new Heineken("Heineken", 24, "�������", 5));
		shop.Add(new Heineken("Heineken", 18, "�������", 7));
		shop.Add(new Heineken("Heineken", 34, "������", 9));
		shop.Add(new Bud("Bud", 15, "�������", 6));
		shop.Add(new Bud("Bud", 20, "�������", 7));
		shop.Add(new Bud("Bud", 31, "������", 8));
		shop.Add(new Bud("Bud", 13, "�������", 0));
		shop.sortByPrice();
		shop.showBeer();
	}
}
