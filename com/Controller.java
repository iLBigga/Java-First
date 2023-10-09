package com;

import java.util.Scanner;

public class Controller{

	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		boolean esci = false; 
		
		do{
			System.out.println("Scegli algoritmo 1,2 o 3 altrimenti scrivi esci");
			String a = scan.nextLine();

			

			switch(a){

				case "1":
					System.out.println("Selezionato algoritmo 1");
					break;

				case "2":
					System.out.println("Selezionato algoritmo 2");
					break;

				case "3":
					System.out.println("Selezionato algoritmo 3");
					break;

				case "esci":
					System.out.println("Arrivederci");
					esci = true;
					break;
					
			}

			if(!esci){
				System.out.println("Ripetere operazione? ( y/n )");
				String risposta = scan.nextLine();


				if(risposta.equalsIgnoreCase("y")) esci = false;
				if(risposta.equalsIgnoreCase("n")) esci = true;
			}

		} while(!esci);
	}
}