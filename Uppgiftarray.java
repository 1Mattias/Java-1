package v49;

import java.util.*;

import org.omg.CORBA.PUBLIC_MEMBER;


public class Uppgiftarray {

	
	
	public static void main(String[] args) {
	
		
		// 100 tal i intervallet [0-9]
		int[] numbers = {1,1,1,2,6,7,8,4,3,7,8,9,3,1,3,7,8,5,3,4,8,9,6,4,2,4,7,9,7,4,3,2,3,6,7,8,7,7,5,7,9,6,1,4,0,8,6,5,6,8,9,0,7,5,4,3,2,4,5,9,8,5,9,8,8,4,5,6,7,8,9,0,9,0,9,7,5,2,1,2,3,4,5,4,4,5,3,4,5,0,8,7,0,7,9,7,0,6,5,4};


		// 100 namn
		String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
		 
		
		
		System.out.println(amountof7(numbers));
		System.out.println(amountoftom(names));
		System.out.println(MaxAndMinAmount(numbers));
        System.out.println(Drusilla(names));
        System.out.println(SumOfAllEven(numbers));
        System.out.println(NameBegginingWithL(names));
        System.out.println(Names5(names));
        System.out.println(Arrays.toString(amountOfEach(numbers)));
        System.out.println(uniqueName(names));
        System.out.println(mostName(names));





		
		
	}
		

		// 1.Hur många 7:or
		
		public static int amountof7(int[]numbers) {
			int counter = 0;
				for (int i = 0; i < numbers.length; i++) {
					
					if (numbers[i] == 7) {
						
						counter++;
						
					}
					
					
				}
				return counter;
		}
				
				// 2.Hur många heter Tom
		
		public static int amountoftom(String[]names) {
			int counter = 0;	
			for (int i = 0; i < names.length; i++) {
					
					if (names[i] == "Tom") {
						
						counter++;
						
					}
					
					
				} 
			return counter;
		}
		//3. Max och minst av alla tal
	    public static String MaxAndMinAmount(int[]numbers){    
	        String out = "";
	        int outnum1 = 0;
	        int outnum2 = 0;
	        int k = 0;
	        int l = 0;

	        int[] index = new int[10];
	        for (int i = index.length - 1; i >= 0; i--){
	            for (int j = 0; j < numbers.length; j++) {
	                if (numbers[j] == i){
	                    index[i]++;
	                }
	            }
	        }

	        for (int i = 0; i < index.length - 1; i++) {
	            k = index[i];
	            l = index[i + 1];
	            if (k < l){
	                outnum1 = l;
	            }
	        }
	        for (int i = 0; i < index.length - 1; i++) {
	            k = index[i];
	            l = index[i + 1];
	            if (k > l) {
	                outnum2 = l;
	            }
	        }
	        out = numbers[outnum1] + ", " + numbers[outnum2];
	        return out;
	    }
	    
	    
	    //4. på vilket index som namnet Drusilla finns
	    public static int Drusilla(String[]names){              
	        int out = 0;
	        for (int i = 0; i < names.length; i++) {
	            if (names[i].equals("Drusilla")){
	                out = i;
	            }
	        }
	        return out;
	    }
	    //5. summan av alla jämna tal
	    public static int SumOfAllEven(int[]numbers){    
	        int out = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            if (numbers[i] % 2 == 0){
	                out += numbers[1];
	            }
	        }

	        return out;
	    }
		//6. Namn sombörjar på L
	    public static int NameBegginingWithL(String[]names){    
	        int out = 0;
	        for (int i = 0; i < names.length; i++) {
	            if (names[i].charAt(0) == 'L'){
	                out++;
	            }
	        }
	        return  out;
	    }
		//7. hur många namn med 5 bostäver
	    public static int Names5(String[]names){            
	        int out = 0;
	        for (int i = 0; i < names.length; i++) {
	            if (names[i].length() == 5){
	                out++;
	            }
	        }
	        return out;
	    }
	    
	    //8. hur många av de individuella talen som finns
	    public static int[] amountOfEach(int[]numbers){

	        int[] list= new int[10];

	        for (int i = 0; i < numbers.length; i++ ){ 
	            list[numbers[i]]++;
	        }
	    return list;
	    }

	    //9. Hur många unika namn som finns
	    public static int uniqueName(String[]names){
	        int unique = 0;
	        for (int i = 0; i < names.length; i++) { // går genom varje namn i arrayen names

	            int j;

	            for (j = 0; j < names.length; j++ ){ // kollar namnet och adderar 1 till unique om namnet inte har uppstått innan sen bryter den loopen när den har gått genom alla namn
	                if(names[i].equals(names[j])){

	                    break;

	                }
	            }

	            if (i == j){
	                unique++;
	            }
	        }
	        return unique;
	    }

	    //10. Namnet som förekommer flest gånger
	    public static String mostName(String[]names){

	        int mos = 0;
	        int vetinte = 0;

	        for (int i = 0; i < names.length; i++) { // går genom hela arrayen names

	            int most = 0;

	            for (int j = 0; j < names.length; j++) { // går genom arrayen igen och om den hittar ett namn igen så adderas det på most

	                if (names[i].equals(names[j])){
	                    most++;
	                }

	            }

	            if (most > mos){
	                mos = most; 
	                vetinte = i; 
	            }

	        }
	        return names[vetinte];
	    }
}
