package javaexp.a00_exp;

public class Season {
	private String sname;
	private String weather; 
	private String priod;
	
	public Season() {
		super();
	}

	public Season(String sname, String weather, String priod) {
		super();
		this.sname = sname;
		this.weather = weather;
		this.priod = priod;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getPriod() {
		return priod;
	}

	public void setPriod(String priod) {
		this.priod = priod;
	}
	
	
	
}
