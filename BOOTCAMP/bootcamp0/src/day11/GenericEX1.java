package day11;

import java.util.ArrayList;

public class GenericEX1{
	
}

class Fruit { public String toString() {	return "Fruit";	} }
class Apple extends Fruit { public String toString() {	return "Apple";	} }
class Grape extends Fruit { public String toString() {	return "Grape";	} }
class Juice { String name;  Juice(String name) { this.name = name; } }
class Juicer{}

class FruitBox<T extends Fruit> extends Box<T> { }
class Box<T>{
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) { list.add(item); }
	T get(int i) { return list.get(i); }
	ArrayList<T> getList() {return list; }
	int size() {return list.size(); }
	public String toString() {return list.toString(); }
}
