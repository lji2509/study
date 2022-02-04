package a01_diexp.vo;
//a01_diexp.vo.Worker
public class Worker {
	private String name;
	private WorkLocation worklocation;
	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Worker(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkLocation getWorklocation() {
		return worklocation;
	}
	public void setWorklocation(WorkLocation worklocation) {
		this.worklocation = worklocation;
	}
	public void showInfo() {
		System.out.println(name + "의 위치는?");
		if(worklocation!=null) {
			System.out.println(worklocation.getLoc() + " 입니다.");
		} else {
			System.out.println("아직 정해지지 않았습니다.");
		}
	}
}
