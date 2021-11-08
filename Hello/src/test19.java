import java.util.Scanner;

public class test19 {

	public static void main(String[] args) {
	
		int tot = 100000;
		String date[] = new String[10];
		String d[] = new String[10];
		String text[] = new String[10];
		int price[] = new int[10];
		int i = 0;
	
		Scanner scan = new Scanner(System.in);

		while(true) {
			int a = 0;
			System.out.println("끝내시려면 음수를 입력하시고, 계속 하시려면 양수를 입력하세요.");
			a = scan.nextInt();
					
			if(a<0) {
				break;
			} 
				
			scan.nextLine();
			
			System.out.println("날짜를 입력해주세요.(YYYYDDMM)");
			for(;;) {
				date[i] = scan.nextLine();
				
				if(date[i].length() != 8) {
					System.out.println("다시 입력해주세요.");
					
				}
				
				int year = Integer.parseInt(date[i].substring(0,4));
				int month = Integer.parseInt(date[i].substring(4,6));
				int dear = Integer.parseInt(date[i].substring(6,8));
		
				
				if(!(year>=1960 && year<=2030)) {
					System.out.println("다시 입력하세요.");
				} else if((month==1 || month==3 || month==5 || month==7 || month==8 ||month==10 || month==12) && dear<=31 && dear>=1) {
					date[i] = date[i].substring(2,4) + "/" + date[i].substring(4,6) + "/" + date[i].substring(6,8);
					break;
				} else if((month==4 || month==6 || month==9 || month==11) && dear<=30 && dear>=1) {
					date[i] = date[i].substring(2,4) + "/" + date[i].substring(4,6) + "/" + date[i].substring(6,8);
					break;
				} else if(!(year%4==0 && year%100!=0 || year%400==0)) {
					if(month==2	&& dear>=1 && dear<=28) {
						date[i] = date[i].substring(2,4) + "/" + date[i].substring(4,6) + "/" + date[i].substring(6,8);
						break;
					} else {
						System.out.println("다시 입력해주세요.");
					}
				} else if(year%4==0 && year%100!=0 || year%400==0) {
					if(month==2 && dear>=1 && dear<=29) {
						date[i] = date[i].substring(2,4) + "/" + date[i].substring(4,6) + "/" + date[i].substring(6,8);
						break;
					} else {
						System.out.println("다시 입력하세요.");
					}
				} else {
					date[i] = date[i].substring(2,4) + "/" + date[i].substring(4,6) + "/" + date[i].substring(6,8);
					break;
				}
		}
			
		
		System.out.println("수입지출 구분을 입력하세요.(\"수입\" 또는 \"지출\")");
		for(;;) {
			d[i] = scan.nextLine();
			if(d[i].equals("지출")) {
				break;
			} else if(d[i].equals("수입")) {
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
	
		System.out.println("내용을 입력하세요.");
		text[i] = scan.nextLine();
		
		System.out.println("금액을 입력하세요.");
		for(;;) {
			price[i] = scan.nextInt();
			if(price[i] < 0) {
				System.out.println("다시 입력하세요.");
			} else {
				break;
			}
		}

		i++;
	}
		
		System.out.println("날짜\t\t구분\t내용\t금액\t처리후금액");
		
		for(int j=0; j<i; j++) {
			if(d[j].equals("지출")) {
				System.out.println(date[j]+"\t"+d[j]+"\t"+text[j]+"\t"+price[j]+"\t"+(tot=tot-price[j]));
			} else {
				System.out.println(date[j]+"\t"+d[j]+"\t"+text[j]+"\t"+price[j]+"\t"+(tot=tot+price[j]));
			}
		}
	}
}
		
