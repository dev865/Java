package generic;

import java.util.ArrayList;

public class Box<T extends Fruit> {
	ArrayList<T> list = new ArrayList<>(); 
	void add(T item) {
		list.add(item);
	}
	T get(int idx) {
		return list.get(idx);
	}
	int size() {
		return list.size();
	}
	public String toString() {
		return list.toString();
	}
}
