import java.util.HashMap;

public class Converter {
	String thousand = "";
	String hundred = "";
	String ten = "";
	String one = "";
	String unit = "";
	boolean empty = true;
	HashMap<Character,String> convertMap;
	
	public Converter() {
		initMap();
	}
	
	private String convert(char ch,String unit) {
		if(ch=='0') {
			return "";
		}
		if(ch=='1') {
			return unit;
		}
		return convertMap.get(ch)+unit;
	}
	
	private String convert(char ch) {
		if(ch=='0')
			return "";
		return convertMap.get(ch);
	}
	
	public void setNumber(char ch, int index) {
		switch(index) {
			case 3:
				this.thousand = convert(ch,"천");
				break;
			case 2:
				this.hundred = convert(ch,"백");
				break;
			case 1:
				this.ten = convert(ch,"십");
				break;
			case 0:
				this.one = convert(ch);
				break;
			default:
				break;
		}
	}
	
	public void setUnit(int index) {
		switch(index) {
			case 0:
				this.unit = "원";
				break;
			case 1:
				this.unit = "만";
				break;
			case 2:
				this.unit = "억";
				break;
			case 3:
				this.unit = "조";
				break;
			default:
				break;
		}
	}
	
	public void setEmpty(boolean empty) {
		this.empty = empty;
	}
	
	public boolean isEmpty() {
		return empty;
	}
	
	public void initMap() {
		convertMap = new HashMap<Character, String>();
		convertMap.put('0', "");
		convertMap.put('1',"일");
		convertMap.put('2',"이");
		convertMap.put('3',"삼");
		convertMap.put('4',"사");
		convertMap.put('5',"오");
		convertMap.put('6',"육");
		convertMap.put('7',"칠");
		convertMap.put('8',"팔");
		convertMap.put('9',"구");
	}
	
	public void exception() {
		if(this.unit.equals("만") 
				&& this.thousand.equals("")
				&& this.hundred.equals("")
				&& this.ten.equals("")
				&& this.one.equals("일")) {
			this.one = "";
		}
		if(this.unit.equals("원")
				&& this.thousand.equals("")
				&& this.hundred.equals("일")
				&& this.ten.equals("")
				&& this.one.equals("")) {
			this.hundred = "십";
		}
	}
	
	@Override
	public String toString() {
		return thousand+hundred+ten+one+unit;
	}
}
