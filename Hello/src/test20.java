import java.util.Scanner;

public class test20 {

	public static void main(String[] args) {
	
		int tot = 100000;
		String date[] = new String[10];
		String d[] = new String[10];
		String text[] = new String[10];
		String price[] = new String[10];
		int i = 0;
	
		Scanner scan = new Scanner(System.in);

		while(true) {
			String a;;
			System.out.println("�����÷��� ������ �Է��Ͻð�, ��� �Ͻ÷��� ����� �Է��ϼ���.");
			a = scan.nextLine();
					
			try {
				Integer.parseInt(a);
			}catch(Exception e) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
			
			if(Integer.parseInt(a)<0) {
				break;
			} 
			
			
			System.out.println("��¥�� �Է����ּ���.(YYYYDDMM)");
			for(;;) {
				date[i] = scan.nextLine();
				
				if(date[i].length() != 8) {
					System.out.println("�ٽ� �Է����ּ���.");
					continue;
				}
				
				int year = Integer.parseInt(date[i].substring(0,4));
				int month = Integer.parseInt(date[i].substring(4,6));
				int dear = Integer.parseInt(date[i].substring(6,8));
		
				
				if(!(year>=1931 && year<=2030)) {
					System.out.println("�ٽ� �Է��ϼ���.");
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
						System.out.println("�ٽ� �Է����ּ���.");
					}
				} else if(year%4==0 && year%100!=0 || year%400==0) {
					if(month==2 && dear>=1 && dear<=29) {
						date[i] = date[i].substring(2,4) + "/" + date[i].substring(4,6) + "/" + date[i].substring(6,8);
						break;
					} else {
						System.out.println("�ٽ� �Է��ϼ���.");
					}
				} else {
					date[i] = date[i].substring(2,4) + "/" + date[i].substring(4,6) + "/" + date[i].substring(6,8);
					break;
				}
		}
			
		
		System.out.println("�������� ������ �Է��ϼ���.(\"����\" �Ǵ� \"����\")");
		for(;;) {
			d[i] = scan.nextLine();
			if(d[i].equals("����")) {
				break;
			} else if(d[i].equals("����")) {
				break;
			} else {
				System.out.println("�ٽ� �Է��ϼ���.");
			}
		}
	
		System.out.println("������ �Է��ϼ���.");
		text[i] = scan.nextLine();
		
		System.out.println("�ݾ��� ���ڷ� �Է��ϼ���.");
		for(;;) {
			price[i] = scan.nextLine();
			
			try {
				Integer.parseInt(price[i]);
			}catch(Exception e) {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		
			if(Integer.parseInt(price[i]) < 0) {
				System.out.println("�ٽ� �Է��ϼ���.");
			} else {
				break;
			}
		}

		
		i++;
	}
		
		System.out.println("ó�� �ݾ� : " + tot);
		System.out.println("��¥\t\t����\t����\t�ݾ�\tó���ıݾ�");
		
		for(int j=0; j<i; j++) {
			if(d[j].equals("����")) {
				System.out.println(date[j]+"\t"+d[j]+"\t"+text[j]+"\t"+price[j]+"\t"+(tot=tot-Integer.parseInt(price[j])));
			} else {
				System.out.println(date[j]+"\t"+d[j]+"\t"+text[j]+"\t"+price[j]+"\t"+(tot=tot+Integer.parseInt(price[j])));
			}
		}
	}
}
		
