package v48;

import java.util.Scanner;

public class Uppgift4_12 {

	public static void main(String[] args) {
		
		//	System.out.println(volume(11));
		
		//	System.out.println(reverse("Hej"));
		
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("skriv ett ord");
			String input = sc.next();
			System.out.println(Valuc(input, sc));
		*/
		
		/*	Scanner sc = new Scanner(System.in);
			System.out.println("skriv ett ord");
			String input = sc.next();
			System.out.println(rovarsproket(input));
		*/	
	}
	
	//H�r r�knas endast volymen ut och skickar till baka det
	
	public static double volume(double radius ) {
		
		return  (4 * Math.PI * Math.pow(radius, 3)) / 3;
	
	}
	
	//tar din str�ng och returnerar det bakl�nges
	
	public static String reverse(String str){  
       String reversed = "";
       for(int i = str.length()- 1; i>= 0; i--) {
    	   reversed += str.charAt(i);
       }
		
       return reversed;
	}
	
	//r�knar hur frekv�nt bokstaven "c" f�rekommer
	
	public static int Valuc (String inputMain, Scanner sc){
		int numbreFoC =0;
		for(int i=0; i<inputMain.length(); i++){
				char oneLetter = inputMain.charAt(i);
				if(oneLetter=='c'){
					numbreFoC= numbreFoC +1;
				}
		}
		return numbreFoC;
		
	}
		
	// Tar in en str�ng och g�r om den till r�varspr�ket	
	
	
	public static String rovarsproket(String inputRe){
		int inputLenght = inputRe.length();
			String kons = "cdghjklmnpqrstvwxz";
			String svar = "";
			for(int i=0; i<inputLenght; i++){
				char oneLetter = inputRe.charAt(i);
				int stop = 0;
			
					for(int r=0;r<18;r++){
						stop = 0;
						char konns = kons.charAt(r);
						if(oneLetter=='b'){
							svar+= oneLetter+"ob";
							r=21;
							
						} else if(oneLetter=='f'){
							svar+=oneLetter+"of";
							r=21;
						} else if (oneLetter==konns){
							svar+=oneLetter+"o" + oneLetter;
							r=21;
						} else {
							stop=1;
						}
					}
					
					if(stop==1){
						svar+=oneLetter;
					}
					
			}
		return svar;	
	}		
	
	
	
	
}
