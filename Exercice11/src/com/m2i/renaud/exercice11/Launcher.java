package com.m2i.renaud.exercice11;

import java.util.Scanner;

public class Launcher {

	public static void main(String[] args) {
		// Demandez � l'utilisateur trois textes et pr�sentez lui ensuite : 
		// il s'agit d'une liste de choses � ne pas oublier pour la journ�e.
		Scanner scanner = new Scanner(System.in);
		String[] taches = new String[5];
		
		// Partie "Remplissage du tableau"
		System.out.println("Donnez les " + taches.length + " t�ches � ne pas oublier aujourd'hui :");
		for(int i = 0; i < taches.length; i++) {
			taches[i] = scanner.nextLine();
		}
		
		// Partie "Affichage du tableau"
		System.out.println("Voici les t�ches � ne pas oublier :");
		for(int i = 0; i < taches.length; i++) {
			System.out.println(" - " + taches[i]);
		}
		
		// On test le push
		
		scanner.close();

	}

}
