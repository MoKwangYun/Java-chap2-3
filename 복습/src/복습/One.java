package 복습;
import java.util.*;

public class One {
	static void method01() {
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int count = 0;
		do {
			
			System.out.print("Enter grade: ");
			int num = scanner.nextInt();
			if(num >= 0) {
				sum += num;
				count++;
			}
			else
				break;
			
			
			
		}while(true);
		
		System.out.println("Total of "+ count + "student grades is "+sum);
		System.out.println("Class average is "+ sum / count);
	}
	
	static void method02() {
		Scanner scanner = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;
		do {
			System.out.print("Enter grade: ");
			int grade = scanner.nextInt();
			
			
			if(grade >= 0) {
				switch(grade/10){
					case 10, 9:
						a++;
						break;
					case 8:
						b++;
						break;
					case 7:
						c++;
						break;
					case 6:
						d++;
						break;
					
					default:
						f++;
				}
			}
			
			else
				break;
			
			
		}while(true);
		
		System.out.println("Number of students who received each grade");
		System.out.println("A: " + a);
		System.out.println("B: " + b);
		System.out.println("C: " + c);
		System.out.println("D: " + d);
		System.out.println("F: " + f);
		
	}
	
	static void method03() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("금액을 입력하시오: ");
		int won = scanner.nextInt();
		
		int array[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		String array2[] = {"오만원", "만원", "오천원", "천원", "오백원", "백원", "오십원", "십원"};
		
		
		for(int i= 0; i<array.length;i++) {
			int count = won / array[i];
			won %= array[i];
			
			if(count != 0)
				System.out.println(array2[i] + count + "매");
			else
				continue;
			
		}
		
	}
	public static void main(String[] args) {
		//method01();
		//method02();
		method03();
	}
}
