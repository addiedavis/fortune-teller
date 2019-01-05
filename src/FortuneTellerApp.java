import java.util.Scanner;

public class FortuneTellerApp {

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
		
		
		input.close();
		System.out.println("Goodbye, thanks for playing!");
		System.exit(0);
	}

}
