import java.util.Scanner;

/**
 * @author Doğan Seyfi Şen - 2022
 */

public class Driver {
	
	public static void main(String[] args) {
		int sum = 0, digit; 
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int number = input.nextInt();
		
		while(number > 0) {
			digit = number % 10;
			sum += digit;
			number /= 10;
		}
		
		System.out.println("Girdiğiniz sayıya ait rakamlar toplamı: " + sum);
		
	}	
}		
