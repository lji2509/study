package javaexp.a00_exp;

public class Season {
	private String season;
	private String weather;
	private String date;
	
	public Season() {
		super();
	}

	public Season(String season, String weather, String date) {
		super();
		this.season = season;
		this.weather = weather;
		this.date = date;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
