import java.util.Scanner;

public class method1 {
	public static void main(String[] args) {
	
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
}
