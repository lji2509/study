package javaexp.a04_vo;

public class Player {
	private String name;
	private String part;
	private String team;
	private double record;

	public Player() {
		super();
	}

	public Player(String name, String part, String team, double record) {
		super();
		this.name = name;
		this.part = part;
		this.team = team;
		this.record = record;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public double getRecord() {
		return record;
	}

	public void setRecord(double record) {
		this.record = record;
	}
}
