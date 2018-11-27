package v48;
import java.util.Scanner;

public class repetitionsuppgifter {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		double kelvin;
		double celsius;
		String name;
		String name2;
		int age;
		int age2;
		double radius;
		double first;
		double last;
		
		//System.out.println(volume(10));
		//System.out.println(kelvinToCelsius(20));
		//System.out.println(welcomeMessage("Mattias", "jenny", 17, 50));
		//System.out.println(cubicCmToCubicM(1000));
		System.out.println(delta(1,10));
	}
	
	static double delta(double first, double last) {
		return Math.abs(last - first);
	}

	static double cubicCmToCubicM(double radius) {
		
		return radius / 1000000;
	}
	
	public static double kelvinToCelsius(double kelvin) {
		
		
		
		return kelvin - 273.15;
	}
	
	static int welcomeMessage(String name, String name2, int age, int age2) {
		
			System.out.println("Hej och välkommna " + name +" och " + name2 + ". Eran kombinerade ålder är: ");
		
				return (age + age2);
		
	}
	
	
	public static double volume(double radius ) {
		
		return  (4 * Math.PI * Math.pow(radius, 3)) / 3;
	
	}
	
	
}
