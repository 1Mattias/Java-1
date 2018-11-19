package v46;
import java.util.Scanner;

public class uppgift6 {

	public static void main(String[] args) {
	
	      Scanner input = new Scanner(System.in);

	        int base = input.nextInt();

	        for(int i = 0; i<base; i++){
	            for(int j = base - i; j>1; j--){ 
	                System.out.print(" ");
	            }

	            for(int j = 0; j <= i; j++){ 
	                System.out.print("X ");
	            }

	            System.out.println(); 
	        }
	    }
	}