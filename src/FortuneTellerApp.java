import java.util.Scanner;

public class FortuneTellerApp {

	private static final Object String = null;

	public static void main(String[] args) throws InterruptedException {
		
		Scanner input = new Scanner(System.in);
		Thread.sleep(1000);
		System.out.println("Hello, what is your first name?");
		String nameFirst = input.next();
		System.out.println("Hello, what is your last name?");
		String nameLast = input.next();
		Thread.sleep(2000);
		System.out.println("Welcome " + nameFirst.substring(0, 1).toUpperCase() + nameFirst.substring(1) + " " + nameLast.substring(0, 1).toUpperCase() + nameLast.substring(1) + ". Answer my questions four and I will tell what your in for.");
		Thread.sleep(2000);
		
		System.out.println("Question one: How old are you?");
		int age = input.nextInt();
		System.out.println("You are " + age);
		
		System.out.println("Question two: What was your birth month? (1-12)");
		int birthMonth = input.nextInt();
		System.out.println("You were born on the " + birthMonth + " month.");
		
		System.out.println("Question three: What is your favorite color (ROYGBIV)? (Type 'help' for information on ROYGBIV)");
		String color = input.next();
		while (color.toLowerCase().equals("help") ) {
			System.out.println("found help");
			System.out.println("R is red\nO is orange\nY is yellow\nG is green\nB is blue\nV is violet");
			System.out.println("So... what is your favorit color (ROYGBIV)?");
			color = input.next();
		}
		System.out.println("Your favorte color is: " + color);
		
		System.out.println("Question four: How many siblings do you have?");
		int siblings = input.nextInt();
		System.out.println("You have " + siblings + " siblings.");
		
		input.close();
		System.out.println("Goodbye, thanks for playing!");
		System.exit(0);
	}

}
