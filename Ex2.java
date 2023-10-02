import java.util.Scanner;


public class Ex2 {
	
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("INSERISCI PRIMO NUMERO");
		int a = scan.nextInt();

		System.out.println("INSERISCI SECONDO NUMERO");
		int b = scan.nextInt();

		System.out.println("INSERISCI TERZO NUMERO");
		int c = scan.nextInt();

		float d = (a + b + c) / 3F;

		System.out.println("MEDIA ARITMETICA: "+d);

    }
}