package javaexp.a04_vo;

public class A03_Hobby {
	private String hobby;
	private int price;
	private String time;
	
	public A03_Hobby() {
		super();
	}

	public A03_Hobby(String hobby, int price, String time) {
		super();
		this.hobby = hobby;
		this.price = price;
		this.time = time;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}
	
}

