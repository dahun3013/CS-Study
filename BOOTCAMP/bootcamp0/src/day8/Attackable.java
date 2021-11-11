package day8;

public interface Attackable {
	final static int AT = 50;
	abstract void att();
	default void deatt() {}
	static void statt() {}

