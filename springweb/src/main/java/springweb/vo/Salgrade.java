package springweb.vo;

public class Salgrade {
	private int grade;
	private int mxsal;
	private int misal;
	public Salgrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salgrade(int grade, int mxsal, int misal) {
		super();
		this.grade = grade;
		this.mxsal = mxsal;
		this.misal = misal;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getMxsal() {
		return mxsal;
	}
	public void setMxsal(int mxsal) {
		this.mxsal = mxsal;
	}
	public int getMisal() {
		return misal;
	}
	public void setMisal(int misal) {
		this.misal = misal;
	}

	
}
