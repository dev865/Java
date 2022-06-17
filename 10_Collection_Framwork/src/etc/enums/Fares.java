package etc.enums;

public enum Fares {
	BUS(100){
		@Override
		int fare(int dist) {
			return dist * BASE_FARE;
		}
		
	},
	KTX(200){
		@Override
		int fare(int dist) {
			return dist * BASE_FARE;
		}
	},
	AIR(300){
		@Override
		int fare(int dist) {
			return dist * BASE_FARE;
		}
	};
	
	final int BASE_FARE;
	
	private Fares(int baseFare) {
		BASE_FARE = baseFare;
	}
	public int getBaseFare() {
		return BASE_FARE;
	}
	abstract int fare(int dist);
}
