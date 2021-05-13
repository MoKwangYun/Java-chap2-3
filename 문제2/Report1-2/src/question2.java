import java.util.Scanner;

public class question2 {
	public static void main(String[] args) {
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
		
		scanner.close();
	}

}
