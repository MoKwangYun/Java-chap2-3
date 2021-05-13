import java.util.Scanner;

public class Report01 {
	
	static void method01()
	{
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
	
		while(true) {
			int grade;
		
		
			System.out.print("Enter grade: ");
			grade = scanner.nextInt();
		
			if(grade<0)
				break;
			else {
				sum += grade;
				count ++;
		
			}
		}
	
	System.out.println("Total of " + count + " student grades is " + sum );
	if(count == 0)
		System.out.println("Can not get the Class average");
	else
	System.out.println("Class average is " + sum/count);

	}
	
	static void method02() {
		Scanner scanner = new Scanner(System.in);
		
		int count_A= 0;
		int count_B= 0;
		int count_C= 0;
		int count_D= 0;
		int count_F = 0;
		
		while(true) {
			int grade;
			
			System.out.print("Enter grade: ");
			
			grade = scanner.nextInt();
			
			if(grade<0)
				break;
			
			switch(grade/10) {
				case 10: case 9:
					count_A++;
					break;
				case 8:
					count_B++;
					break;
				case 7:
					count_C++;
					break;
				case 6:
					count_D++;
					break;
				default:
					count_F++;
					break;
			}
		}
		System.out.println("");
		System.out.println("Number of students who received each grade:");
		System.out.println("A: " + count_A);
		System.out.println("B: " + count_B);
		System.out.println("C: " + count_C);
		System.out.println("D: " + count_D);
		System.out.println("F: " + count_F);
		
		
	}
	
	static void method03() {
		Scanner scanner = new Scanner(System.in);
		int money;
		
		int Array[] = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		String Array2[] = {"오만원권", "만원권", "천원권", "오백원", "백원", "오십원", "십원", "일원"};
		
		System.out.printf("금액을 입력하시오: ");
		money = scanner.nextInt();
				 
		 
		for(int i = 0; i <Array.length; i++) 
		{	
			
			if((money)/Array[i] != 0)
				System.out.println(Array2[i] + (money)/Array[i] + "매");
			money %= Array[i];
		}
	}
	
	public static void main(String[] args) {
		method01();
		method02();
		method03();
	}

}
