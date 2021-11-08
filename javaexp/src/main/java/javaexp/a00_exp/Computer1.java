package javaexp.a00_exp;

public class Computer1 {
	private String make;
	private String cpu;
	private int ram;
	private int hdd;
	
	public Computer1() {
		super();
	}

	public Computer1(String make, String cpu, int ram, int hdd) {
		super();
		this.make = make;
		this.cpu = cpu;
		this.ram = ram;
		this.hdd = hdd;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}
	
	
	
}
