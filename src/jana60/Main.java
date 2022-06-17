package jana60;

import java.util.Scanner;

public class Main {
	 public static void main(String[] args) {

	        Scanner scan = new Scanner(System.in);
	        System.out.print("Inserisci il numero di km che vuoi percorrere: ");
	        double km = scan.nextDouble();
	        scan.nextLine();
	        System.out.print("Inserisci la tua età: ");
	        int age = scan.nextInt();

	        scan.close();

	        Ticketteria biglietto = new Ticketteria();

	        biglietto.setKm(km);
	        biglietto.setAge(age);

	        System.out.println("Il prezzo del biglietto è " + biglietto.prezzoFormat());
	    }
}