import java.util.Scanner;

public class fizzBuzz {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Number: ");
		int number = scanner.nextInt();
		int module3 = number%3;
		int module5 = number%5;
		boolean both = module5 == 0 && module3 == 0;
		
		if (both == true) {
			System.out.println("FizzBuzz");		
		}
		else if (module5 == 0) {
			System.out.println("Fizz");
		}
		else if (module3 == 0) {
			System.out.println("Buzz");
		}
		else {
			System.out.println(number);
		}
	}

}
