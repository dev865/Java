package etc.enums;

public enum Direction {
	EAST(1, ">"),
	SOUTH(2, "V"),
	WEST(3, "<"),
	NORTH(4, "^");
	
	private static final Direction[] DR_ARR = Direction.values();
	private final int value;
	private final String sign;
	
	Direction(int value, String sign) {
		this.value = value;
		this.sign = sign;
	}
	public int getValue() {
		return this.value;
	}
	public String getSign() {
		return this.sign;
	}
	
}
