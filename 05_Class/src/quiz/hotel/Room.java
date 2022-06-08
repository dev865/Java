package quiz.hotel;

public class Room {
	private String roomNum;
	private User user;
	private boolean empty;
	private String checkInTime;
	private String checkOutTime;
	
	public Room() {
		
	}

	public Room(String roomNum, User user, boolean empty, String checkInTime, String checkOutTime) {
		super();
		this.roomNum = roomNum;
		this.user = user;
		this.empty = empty;
		this.checkInTime = checkInTime;
		this.checkOutTime = checkOutTime;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public boolean isEmpty() {
		return empty;
	}

	public void setEmpty(boolean empty) {
		this.empty = empty;
	}

	public String getCheckInTime() {
		return checkInTime;
	}

	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}

	public String getCheckOutTime() {
		return checkOutTime;
	}

	public void setCheckOutTime(String checkOutTime) {
		this.checkOutTime = checkOutTime;
	}

	@Override
	public String toString() {
		return "Room [roomNum=" + roomNum + ", user=" + user + ", empty=" + empty + ", checkInTime=" + checkInTime
				+ ", checkOutTime=" + checkOutTime + "]";
	}
	
}
