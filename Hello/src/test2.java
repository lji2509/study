
public class test2 {
	
	static int totSum = 0;
	static double totAvg = 0;
	
	static double avg(String name, int kor, int eng, int math) {
		int sum = kor+eng+math;
		double avg = sum/3.0;
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + sum + "\t" + avg);
		totSum += sum;
		totAvg += avg;
		return totAvg;
	}
	
	public static void main(String[] args) {
		double avg = 0;
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		avg = avg("홍길동",94,70,80);
		avg = avg("김길동",80,65,94);
		avg = avg("이길동",88,92,83);
		System.out.println("전체 총점 : " + totSum + "점");
		System.out.printf("전체 평균 : %.2f점\n", avg/3);
	}

}
