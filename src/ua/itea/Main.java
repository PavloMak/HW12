package ua.itea;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<Cat>();

		for (int i = 0; i < 200; i++) {
			int r = (int) (Math.random() * 5 + 1);
			switch (r) {
			case 1:
				cats.add(new AbyssinianCat());
				break;
			case 2:
				cats.add(new BirmanCat());
				break;
			case 3:
				cats.add(new ShorthairCat());
				break;
			case 4:
				cats.add(new PeterbaldCat());
				break;
			case 5:
				cats.add(new StreetCat());
				break;

			}
		}
		FabricOfCatMeat fabric = new FabricOfCatMeat();
		fabric.sortCats(cats);
	}

}
