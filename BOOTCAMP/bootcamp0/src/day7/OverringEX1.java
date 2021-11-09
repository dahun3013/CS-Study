package day7;

public class OverringEX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point3D p = new Point3D();
		p.setX(100);
		p.setY(50);
		p.setZ(70);
		p.getLocation();
	}
}
class Point{
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	int x;
	int y;
	String getLocation() {
		return "x :"+x+", y :"+y;
	}
}

class Point3D extends Point{
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	int z;
	String getLocation() {
		return "x :"+x+", y :"+y+", z :"+z;
	}	
}
