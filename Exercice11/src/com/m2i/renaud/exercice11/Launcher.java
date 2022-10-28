package com.m2i.renaud.exercice11;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// Demandez à l'utilisateur trois textes et présentez lui ensuite : 
		// il s'agit d'une liste de choses à ne pas oublier pour la journée.
		Scanner scanner = new Scanner(System.in);
		String[] taches = new String[5];
		
		// Partie "Remplissage du tableau"
		System.out.println("Donnez les " + taches.length + " tâches à ne pas oublier aujourd'hui :");
		for(int i = 0; i < taches.length; i++) {
			taches[i] = scanner.nextLine();
		}
		
		// Partie "Affichage du tableau"
		System.out.println("Voici les tâches à ne pas oublier :");
		for(int i = 0; i < taches.length; i++) {
			System.out.println(" - " + taches[i]);
		}
		
		scanner.close();

	}

}
