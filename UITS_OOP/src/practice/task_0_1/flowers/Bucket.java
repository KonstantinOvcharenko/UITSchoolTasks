package practice.task_0_1.flowers;

import practice.task_0_1.flowers.flower.*;

public class Bucket {
	private Flower[] bucket;
	private int cost = 0;

	public Bucket() {
		bucket = new Flower[0];
	}

	public void addFlower(Flower flower) {
		Flower[] newBucket = new Flower[bucket.length + 1];
		System.arraycopy(bucket, 0, newBucket, 0, bucket.length);
		newBucket[newBucket.length - 1] = flower;
		bucket = newBucket;
		cost += flower.getPrice();
	}

	public void addFlowers(String flw, int n) {
		switch (flw) {
		case "rose":
			for (int i = 0; i < n; i++) {
				addFlower(new Rose());
			}
			break;
		case "tulip":
			for (int i = 0; i < n; i++) {
				addFlower(new Tulip());
			}
			break;
		case "chrisanthema":
			for (int i = 0; i < n; i++) {
				addFlower(new Chrisanthema());
			}
			break;
		}
	}

	public void showBucket() {
		for (Flower f : bucket) {
			System.out.println(f.toString());
		}
		System.out.println("Стоимость букета: " + cost + " грн.");
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void sortByFreshness() {
		for (int i = 1; i < bucket.length; i++) {
			Flower newElem = bucket[i];
			int location = i - 1;
			while (location >= 0 && bucket[location].getFreshness() > newElem.getFreshness()) {
				bucket[location + 1] = bucket[location];
				location--;
			}
			bucket[location + 1] = newElem;
		}

	}

	public void findByStemLength(int a, int b) {
		System.out.println("Цветы в заданном диапазоне длин стеблей:");
		for (Flower f : bucket) {
			if (f.getStemlength() > a && f.getStemlength() < b) {
				System.out.println(f.toString());
			}
		}
	}
}
