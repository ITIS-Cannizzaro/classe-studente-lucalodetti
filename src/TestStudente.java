

import java.util.Scanner;

public class TestStudente {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//creazione primo oggetto
		Studente studente = new Studente();
		
		//imposta nome primo oggetto
		System.out.println("inserisci nome studente: ");
		studente.setNome(scan.nextLine());
		
		//imposta anno di nascita primo oggetto
		System.out.println("inserisci anno di nascita studente: ");
		studente.setAnnoNascita(scan.nextInt());
		
		//creazione secondo oggetto
		Studente studente1 = new Studente();
		
		//stampa dati dei due oggetti
		System.out.println(studente.toString());
		System.out.println(studente1.toString());
		
		//controllo differenza età
		if(studente.getAnnoNascita() == studente1.getAnnoNascita()) {
			System.out.println("sono coetanei.");
		} else if(studente.getAnnoNascita() > studente1.getAnnoNascita()){
			System.out.println(studente.getNome() + " è più grande");
		} else if(studente.getAnnoNascita() < studente1.getAnnoNascita()){
			System.out.println(studente1.getNome() + " è più grande");
		}
		
	}

}
