import java.util.Scanner;


public class Ex3 {
	
	public static void main(String[] args){

		//ESERCIZIO 1

		//Scrivi un programma Java che prende due numeri da tastiera e stampa quello è più grande.


        // Scanner scan = new Scanner(System.in);

        // System.out.println("INSERISCI PRIMO NUEMRO");
        // int a = scan.nextInt();

		// System.out.println("INSERISCI SECONDO NUEMRO");
        // int b = scan.nextInt();

		// String testo = "Il numero piu grande e': ";
 
		// if(a > b) System.out.println(testo+a);
		// else System.out.println(testo+b);1


		//ESERCIZIO 2

		// Scrivi un programma Java che prende due numeri da tastiera e stampa 
		//	“I numeri inseriti sono uguali” se i due numeri sono uguali e viceversa 
		//	stampa “I numeri inseriti sono diversi”.

		// Scanner scan = new Scanner(System.in);

        // System.out.println("INSERISCI PRIMO NUEMRO");
        // int a = scan.nextInt();

		// System.out.println("INSERISCI SECONDO NUEMRO");
        // int b = scan.nextInt();

		// if(a == b) System.out.println("I numeri inseriti sono uguali");
		// else System.out.println("I numeri inseriti sono diversi");


		//ESERCIZIO 5

		// Scrivi un programma Java che,  dati in input da tastiera due numeri che 
		// rappresentano base e altezza, stampi il valore dell'area di un triangolo (base*altezza/2)

		// Scanner scan = new Scanner(System.in);

        // System.out.println("BASE");
        // int a = scan.nextInt();

		// System.out.println("ALTEZZA");
        // int b = scan.nextInt();

		// float c = (a * b) /2F;

		// System.out.println("L'area e' di: "+c);


		// ESERCIZIO 6

		// Scrivi un programma Java che chieda all'utente  di scegliere tra due numeri 
		// (0 per calcolare l'area di un triangolo e 1 per l'area di un rettangolo) e, in base a
		// quale figura geometrica ha scelto, chiedere i dati mancanti e stampare l'area della figura geometrica richiesta.

		Scanner scan = new Scanner(System.in);

        System.out.println("SSCEGLI FIGURA 0 O 1");
        int figura = scan.nextInt();

		if(figura == 0) {

			System.out.println("Base");
			int a = scan.nextInt();

			System.out.println("Altezza");
			int b = scan.nextInt();

			float c = (a * b)/2F;

			System.out.println("L'area e' di: "+c);

		} else {

			System.out.println("Lato");
			int a = scan.nextInt();

			int c = a * a;

			System.out.println("L'area e' di: "+c);
		}

    }

}
