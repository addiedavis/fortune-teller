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
		System.out.println("Welcome " + nameFirst.substring(0, 1).toUpperCase() + nameFirst.substring(1) + " "
				+ nameLast.substring(0, 1).toUpperCase() + nameLast.substring(1)
				+ ". Answer my questions four and I will tell what your in for.");
		Thread.sleep(2000);

		System.out.println("Question one: How old are you?");
		int age = input.nextInt();
		int retirement = 0;
		if (age <= 0) {
			retirement = 100;
		} else if (age % 2 == 0) {
			retirement = 33;
		} else {
			retirement = 45;
		}

		System.out.println("Question two: What was your birth month? (1-12)");
		int birthMonth = input.nextInt();
		int accountAmount = 0;

		if (birthMonth < 1 || birthMonth > 12) {
			accountAmount = 0;
		} else if (birthMonth < 5) {
			accountAmount = 300000000;
		} else if (birthMonth < 9) {
			accountAmount = 100000;
		} else {
			accountAmount = 90000;
		}

		System.out.println(
				"Question three: What is your favorite color? \nanswer in a single letter out of ROYGBIV \n(Type 'help' for information on ROYGBIV)");
		String color = input.next();
		while (color.length() != 1) {
			while (color.toLowerCase().equals("help")) {
				System.out.println("found help");
				System.out
						.println("R is red\nO is orange\nY is yellow\nG is green\nB is blue\nI is indigo\nV is violet");
				System.out.println("So... what is your favorit color (ROYGBIV)?");
				color = input.next();
			}
			System.out.println("Please indicate a color using a single character.\nType help for valid colors.");
			color = input.next();
		}

		String transport = "nothing";

		if (color.toLowerCase().equals("r")) {
			transport = "Lamborghini";
		} else if (color.toLowerCase().equals("o")) {
			transport = "Vespa";
		} else if (color.toLowerCase().equals("y")) {
			transport = "Jeep";
		} else if (color.toLowerCase().equals("g")) {
			transport = "Triumph Scrambler";
		} else if (color.toLowerCase().equals("b")) {
			transport = "Honda Accord";
		} else if (color.toLowerCase().equals("i")) {
			transport = "Public Transit";
		} else if (color.toLowerCase().equals("v")) {
			transport = "Walking";
		} else {
			transport = "the seat of you pants";
		}

		System.out.println("Your favorte color is: " + color);

		System.out.println("Question four: How many siblings do you have?");
		int siblings = input.nextInt();
		String location = "nowhere";
		System.out.println("You have " + siblings + " siblings.");

		if (siblings > 3) {
			location = "Columbus, OH";
		} else if (siblings > 2) {
			location = "Cleveland, OH";
		} else if (siblings > 1) {
			location = "Cincinnati, OH";
		} else if (siblings > 0) {
			location = "Toledo, OH";
		} else if (siblings == 0) {
			location = "Portland, OR";
		} else {
			location = "Saint Louis, MO";
		}

		input.close();
		System.out.println(nameFirst.substring(0, 1).toUpperCase() + nameFirst.substring(1) + " "
				+ nameLast.substring(0, 1).toUpperCase() + nameLast.substring(1) + " will retire in " + retirement
				+ " years with $" + accountAmount + " in the bank, a vacation home in " + location + ", and travel by "
				+ transport + ".");
		System.out.println("Goodbye, thanks for playing!");
		System.exit(0);
	}

}
