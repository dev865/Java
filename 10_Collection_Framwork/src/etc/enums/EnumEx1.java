package etc.enums;

public class EnumEx1 {

	public static void main(String[] args) {
		Directions east = Directions.EAST;
		Directions west = Directions.WEST;
		Directions south = Directions.SOUTH;
		Directions north = Directions.NORTH;
		
		Directions dr1 = Directions.valueOf("SOUTH");
		Directions dr2 = Enum.valueOf(Directions.class, "WEST");
		
		Directions[] drArr = Directions.values();
		for (Directions dr : drArr) {
			System.out.println(dr.name() + " : " + dr.ordinal());
		}
		
		
		System.out.println("==========================");
		
		
		for (Direction dr : Direction.values()) {
			System.out.println(dr.name() + " : " + dr.getValue() + " : " + dr.getSign());
		}
	}
}