import java.util.Scanner;

public class question3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int money;
		int count1;
		int count2;
		int count3;
		int count4;
		int count5;
		int count6;
		int count7;
		int count8;
		
		System.out.print("�ݾ��� �Է��Ͻÿ�: ");
		
		money = scanner.nextInt();
		
		count1 = money / 50000;
		if(count1 != 0) {
			System.out.println("�������� " + count1 + "��");
		}
		
		count2 = (money%50000)/10000;
		if(count2 != 0) {
			System.out.println("������ " + count2 + "��");
		}
		
		count3 = (money%10000)/1000;
		if(count3 != 0) {
			System.out.println("õ���� " + count3 + "��");
		}
		
		count4 = (money%1000)/500;
		if(count4 != 0) {
			System.out.println("����� " + count4 + "��");
		}
		
		count5 = (money%500)/100;
		if(count5 != 0) {
			System.out.println("��� " + count5 + "��");
		}
		
		count6 = (money%100)/50;
		if(count6 != 0) {
			System.out.println("���ʿ� " + count6 + "��");
		}
		
		count7 = (money%50)/10;
		if(count7 != 0) {
			System.out.println("�ʿ� " + count7 + "��");
		}
		
		count8 = (money%10)/1;
		if(count8 != 0) {
			System.out.println("�Ͽ� " + count8 + "��");
		}
	}

}
