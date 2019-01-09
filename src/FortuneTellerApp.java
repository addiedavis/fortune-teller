import java.util.Scanner;

public class FortuneTellerApp {

	private static final Object String = null;

	public static void main(String[] args) throws InterruptedException {

		Scanner input = new Scanner(System.in);

		String regex = "[a-z]*";
		String numRegex   = "[0-9]*";

		
		Thread.sleep(2000);
		System.out.println(
				"Answer my questions and I will tell you your future.\nYou can quit any time by typing in \"quit\"");
		Thread.sleep(2000);

		Thread.sleep(500);
		System.out.println("What is your first name?");
		String nameFirst = input.next();
		if (nameFirst.toLowerCase().equals("quit")) {
			System.out.println("No one likes a quitter...");
			System.exit(0);
		}
		System.out.println("And your last name?");
		String nameLast = input.next();
		if (nameLast.toLowerCase().equals("quit")) {
			System.out.println("No one likes a quitter...");
			System.exit(0);
		}

		System.out.println("Question one: How old are you?");
		String howOld = input.next();

		if (howOld.toLowerCase().matches(regex)) {
		while (howOld.toLowerCase().matches(regex)) {
				if (howOld.toLowerCase().equals("quit")) {
					System.out.println("No one likes a quitter...");
					System.exit(0);
				}
				System.out.println("Please enter a number.");
				howOld = input.next();
			}
		}
		
		int age = Integer.parseInt(howOld);

		System.out.println("Question two: What was your birth month? (1-12)");
		String birthMonthString = input.next();
		while (birthMonthString.toLowerCase().matches(regex)) {
			if (birthMonthString.toLowerCase().equals("quit")) {
				System.out.println("No one likes a quitter...");
				System.exit(0);
			}
			System.out.println("Please enter a number 1-12.");
			birthMonthString = input.next();
		}
		int birthMonth = Integer.parseInt(birthMonthString);

		System.out.println(
				"Question three: What is your favorite color? \nanswer in a single letter out of ROYGBIV \n(Type 'help' for information on ROYGBIV)");
		String color = input.next();
		while (color.length() != 1) {
			while (color.toLowerCase().equals("help")) {
				System.out.println("I found you some help.");
				System.out
						.println("R is red\nO is orange\nY is yellow\nG is green\nB is blue\nI is indigo\nV is violet");
				System.out.println("So... what is your favorit color?");
				color = input.next();
			}
			System.out.println(
					"Please indicate a color using a single character.\nLike any in ROYGBIV\nType help for valid colors.");
			color = input.next();
		}

		System.out.println("Question four: How many siblings do you have?");
		String siblingsString = input.next();
		while (siblingsString.toLowerCase().matches(regex)) {
			if (siblingsString.toLowerCase().equals("quit")) {
				System.out.println("No one likes a quitter...");
				System.exit(0);
			}
			System.out.println("Please enter a number.");
			siblingsString = input.next();
		}
		int siblings = Integer.parseInt(siblingsString);

		input.close();

		int retirement = 0;
		int accountAmount = 0;
		String transport = "nothing";
		String location = "nowhere";

		if (age <= 0) {
			retirement = 100;
		} else if (age % 2 == 0) {
			retirement = 33;
		} else {
			retirement = 45;
		}

		if (birthMonth < 1 || birthMonth > 12) {
			// accountAmount = 0;
		} else if (birthMonth < 5) {
			accountAmount = 300000000;
		} else if (birthMonth < 9) {
			accountAmount = 100000;
		} else {
			accountAmount = 90000;
		}

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
			location = "Loserville, WY";
		}

		if (color.toLowerCase().equals("r")) {
			transport = "a Lamborghini";
		} else if (color.toLowerCase().equals("o")) {
			transport = "a Vespa";
		} else if (color.toLowerCase().equals("y")) {
			transport = "a Jeep";
		} else if (color.toLowerCase().equals("g")) {
			transport = "a Triumph Scrambler";
		} else if (color.toLowerCase().equals("b")) {
			transport = "a Honda Accord";
		} else if (color.toLowerCase().equals("i")) {
			transport = "Public Transit";
		} else if (color.toLowerCase().equals("v")) {
			transport = "Walking";
		} else {
			transport = "the seat of you pants";
		}

		System.out.println(nameFirst.substring(0, 1).toUpperCase() + nameFirst.substring(1) + " "
				+ nameLast.substring(0, 1).toUpperCase() + nameLast.substring(1) + " will retire in " + retirement
				+ " years with $" + accountAmount + " in the bank, a vacation home in " + location + ", and travel by "
				+ transport + ".");
		System.out.println("Goodbye, thanks for playing!");
		System.exit(0);
	}

}
