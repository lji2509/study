package a01_diexp.vo;
//a01_diexp.vo.Bus
import java.util.ArrayList;

public class Bus {
	private String num;
	private ArrayList<Passenger> plist;
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bus(String num) {
		super();
		this.num = num;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public ArrayList<Passenger> getPlist() {
		return plist;
	}
	public void setPlist(ArrayList<Passenger> plist) {
		this.plist = plist;
	}
	public void showPassenger() {
		System.out.println(num + "번 버스의 탑승자들");
		if(plist!=null) {
			for(Passenger p:plist) {
				System.out.println(p.getName() + "\t" + p.getAge());
			}
		} else {
			System.out.println("탑승객이 없습니다.");
		}
	}
}
