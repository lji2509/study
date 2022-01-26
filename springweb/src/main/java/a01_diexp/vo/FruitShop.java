package a01_diexp.vo;
//a01_diexp.vo.FruitShop
import java.util.Properties;
import java.util.Set;

public class FruitShop {
	//물건명을 중복되지 않게 담을 Set객체 선언
	private Set<String> pname;
	//물건명이 연계되어 있는 값을 설정할 수 있는 Properties 객체 선언
	private Properties  addProd; //문자열/문자열 키/value값 설정
	public FruitShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set<String> getPname() {
		return pname;
	}
	//set 객체를 저장할 메서드
	public void setPname(Set<String> pname) {
		this.pname = pname;
	}
	public Properties getAddProd() {
		return addProd;
	}
	//properties 객체를 저장할 메서드
	public void setAddProd(Properties addProd) {
		this.addProd = addProd;
	}
	public String toString() {
		return "물건명(set) : " + pname + ", 물건명&가격(properties) : " + addProd;
	}
}
