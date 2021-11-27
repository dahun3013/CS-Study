import java.util.Comparator;

public class P253EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhysData[] pData = {
			new PhysData("",222,1),
			new PhysData("",111,0),
			new PhysData("±Ë«—∞·",169,0.8)
		};§§
		
		Comparator<PhysData> heightCompartor = new Comparator<PhysData>()
				{

					@Override
					public int compare(PhysData o1, PhysData o2) {
						// TODO Auto-generated method stub
						return o1.height - o2.height;
					}
			
		};
		
		Comparator<PhysData> visionCompartor = new Comparator<PhysData>()
		{

			@Override
			public int compare(PhysData o1, PhysData o2) {
				// TODO Auto-generated method stub
				return (int)(o1.vision - o2.vision);
			}
	
};
	}
}

class PhysData{
	String name;
	int height;
	double vision;
	
	public PhysData(String name, int height, double vision) {
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	@Override
	public String toString() {
		return name + " " + height + " " + vision;
	}
}
