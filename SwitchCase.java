package v2;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {

		// Switch - case är användbart när man har ett bestämt antal fall som kan hända,
		// t ex en meny för användare

		
		/*
		 * Först så skapade jag en bolean som var true och som sedan blev false om man valde "quit"
		 * Det gör att den frågar frågan tills man inte väljer quit
		 * Jag la även till en switch i en egen switch som gör att man får upp fler genrer och frågan om man vill välja igen
		*/
		boolean DoIt = true;
		System.out.println("Welcome to movie inspiration database! Please choose a genre!");
		while(DoIt) {
		Scanner input = new Scanner(System.in);

		
		System.out.println("(1) - Thriller");
		System.out.println("(2) - Comedy");
		System.out.println("(3) - Romance");
		System.out.println("(4) - Fantasy");
		System.out.println("(5) - Quit");
		System.out.println("(6) - More genres");
		System.out.println();

		int choice = input.nextInt();

		String genre;

		switch (choice) {
		case 1:
			genre = "Thriller";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. A quit place, av John Krasinski");
			System.out.println("2. The dark night, av Christopher Nolan");
			System.out.println("3. The silence of the lamb, av Jonathan Demme");
			System.out.println();
			break;
		case 2:
			genre = "Comedy";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. Deadpool 2, av David Leitch");
			System.out.println("2. Dum och dummare, av Peter Farelly");
			System.out.println("3. Bridesmaid, av Paul Feig");
			System.out.println();
			break;
		case 3:
			genre = "Romance";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. The notebook, av Nick Cassavetes");
			System.out.println("2. The holidays, av Nancy Meyrs");
			System.out.println("3. Love Simon, av Greg Berlanti");
			System.out.println();
			break;
		case 4:
			genre = "Fantasy";
			System.out.println("You chose " + genre + "! Here are three good movies!");
			System.out.println();
			System.out.println("1. Lord of the rings - Sagan om ringen, av Peter Jackson");
			System.out.println("2. Aquaman, av James Wan");
			System.out.println("3. Avengers - Infinity war, av Anthony & Joe Russo");
			System.out.println();
			break;
		case 5:
			System.out.println("Thank you for today!");
			DoIt = false;
			break;
			
		case 6:
			
			System.out.println("Here are some more genres");
			System.out.println("(1) - Action");
			System.out.println("(2) - Documentary");
			System.out.println("(3) - Adventure");
			System.out.println("(4) - True Story");
			System.out.println("(5) - Quit");
			System.out.println();
			System.out.println("Would you like to choose again?");
			System.out.println("(6) - Yes");
			System.out.println("(7) - No");
			
			int choice1 = input.nextInt();

			String genre1;

			switch (choice1) {
			case 1:
				genre1 = "Action";
				System.out.println("You chose " + genre1 + "! Here are three good movies!");
				System.out.println();
				System.out.println("1. A quit place, av John Krasinski");
				System.out.println("2. The dark night, av Christopher Nolan");
				System.out.println("3. The silence of the lamb, av Jonathan Demme");
				System.out.println();
				
				
				break;
			case 2:
				genre = "Documentary";
				System.out.println("You chose " + genre + "! Here are three good movies!");
				System.out.println();
				System.out.println("1. Deadpool 2, av David Leitch");
				System.out.println("2. Dum och dummare, av Peter Farelly");
				System.out.println("3. Bridesmaid, av Paul Feig");
				System.out.println();
				break;
			case 3:
				genre = "Adventure";
				System.out.println("You chose " + genre + "! Here are three good movies!");
				System.out.println();
				System.out.println("1. The notebook, av Nick Cassavetes");
				System.out.println("2. The holidays, av Nancy Meyrs");
				System.out.println("3. Love Simon, av Greg Berlanti");
				System.out.println();
				break;
			case 4:
				genre = "True story";
				System.out.println("You chose " + genre + "! Here are three good movies!");
				System.out.println();
				System.out.println("1. Lord of the rings - Sagan om ringen, av Peter Jackson");
				System.out.println("2. Aquaman, av James Wan");
				System.out.println("3. Avengers - Infinity war, av Anthony & Joe Russo");
				System.out.println();
				break;
			case 5:
				System.out.println("Thank you for today!");
				break;
			case 6:
				DoIt = true;
				break;
			case 7:
				System.out.println("Thank you for today!");
				DoIt = false;
				break;
				
				
			default:
				genre = "invalid";
				System.out.println("You have made a " + genre + " choice! Too bad for you!");
				System.out.println();
				break;
		}
			
			break;
		default:
			genre = "invalid";
			System.out.println("You have made a " + genre + " choice! Too bad for you!");
			System.out.println();
			break;
		}



	}
	}
}