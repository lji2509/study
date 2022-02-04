package a01_diexp.vo;
//a01_diexp.vo.GiftSender
import org.springframework.beans.factory.annotation.Autowired;

public class GiftSender {
	private String name;
	@Autowired
	private Product prod;
	public GiftSender() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GiftSender(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	public void showInfo() {
		if(prod!=null) {
			System.out.println(name + "이 " + prod.getName() + "를 선물한다.");
		} else {
			System.out.println("아직 보내지 않았습니다.");
		}
	}
}
