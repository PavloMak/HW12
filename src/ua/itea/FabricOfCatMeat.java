package ua.itea;

import java.lang.annotation.Annotation;
import java.util.List;

public class FabricOfCatMeat<T> {

	public void sortCats(List<T> cats) {
		int number = 0;
		System.out.println(cats.size() + " arrivesd to fabric");
		for (T t : cats) {
			Class cat = t.getClass();
			if (cat.getSuperclass() == Cat.class) {
				Color column = (Color) cat.getAnnotation(Color.class);
				if (cat.isAnnotationPresent(Blochable.class) || cat.isAnnotationPresent(Skinny.class)
						|| cat.getMethods().length > 11 || column.colorOfFur().equals("black")) {
					continue;
				}
				number++;
			}
		}
		System.out.println("So the number of cats that can be processed into meet is " + number);

	}

}
