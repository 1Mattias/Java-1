package v46;
import java.util.Scanner;
public class uppgift3 {

public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int counter = 0;
		int resultat = 0;
		
		while(true) {
			int x = input.nextInt();
			counter++;
			if(counter == 10) {
				break;
			}
			resultat *= x;
			if(resultat > 100000) {
				break;
			}
			}
			
		}
	
}
