package a01_diexp.vo;
//a01_diexp.vo.Apartment
public class Apartment {
	private String groupNum;
	private String roomNum;
	public Apartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Apartment(String groupNum, String roomNum) {
		super();
		this.groupNum = groupNum;
		this.roomNum = roomNum;
	}
	public String getGroupNum() {
		return groupNum;
	}
	public void setGroupNum(String groupNum) {
		this.groupNum = groupNum;
	}
	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	
}
