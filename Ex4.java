import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);


		// System.out.println("Inserisci un parola");
		// String a = scan.nextLine();

		// System.out.println("Inserisci un numero");
		// int b = scan.nextInt();

		// int x = a.length();

		// if(b <= x){
		// 	char c = a.charAt(b);
		// 	System.out.println("La lettera nella posizione " + b + " e' " + c);
		// }else{
		// 	System.out.println("Parola troppo corta");
		// }	


		// System.out.println("Inserisci un parola");
		// String a = scan.nextLine();

		// System.out.println("Inserisci un carattere");
		// String b = scan.nextLine();

		// if( a.contains(b)){
		// 	int c = a.indexOf(b);

		// 	System.out.println("La posizione di " + b + " e' " + c);
		// }else {
		// 	System.out.println(a + " non contiene la lettera " + b);
		// }


		System.out.println("Inserisci la prima parola");
		String a = scan.nextLine();

		System.out.println("Inserisci la seconda parola");
		String b = scan.nextLine();

		System.out.println(a + " " + b);

	}
}