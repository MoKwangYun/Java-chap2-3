import java.util.Scanner;

public class question32 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int money;
		
		int Array[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		String Array2[] = {"��������", "������", "õ����", "�����", "���", "���ʿ�", "�ʿ�", "�Ͽ�"};
		
		System.out.printf("�ݾ��� �Է��Ͻÿ�: ");
		money = scanner.nextInt();
				 
		 
		for(int i = 0; i <Array.length; i++) 
		{	
			
			if((money)/Array[i] != 0)
				System.out.println(Array2[i] + (money)/Array[i] + "��");
			money %= Array[i];
		}
		
	}

}
