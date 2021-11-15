package day11;

public class EnumEX1 {

	public static void main(String[] args) {
		// 열거형  장점 : 안전성 제품품목 A1001~A1010 A10010  694
       Direction d1 = Direction.EAST;
       Direction d2 = Direction.valueOf("WEST");
       Direction d3 = Enum.valueOf(Direction.class, "EAST");
       System.out.println(d1 + " " + d2 + " " + d3);
       System.out.println(d1.getValue() + " " + d2.getValue() + " " + d3.getValue());
	}

}

enum Direction { 
	EAST(1), SOUTH(5), WEST(-1), NORTH(10);
	private final int value;
	Direction(int value) { this.value = value; }
	public int getValue() { return value; }
}
