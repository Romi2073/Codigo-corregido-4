package com.CodigoOtros;

import java.util.Scanner; //Importamos Scanner

//EL programa es el juego "piedra, papel o tijera", se le pide al usuario que selecione una opción, posteriormente se le pide lo mismo al segundo usuario, sus inputs se comparan mediante un if y con ayuda de un switch se elige al ganador.

public class Codigo4 {

	public static void main(String[] args) {

		// Renombramos s por scanner.
		Scanner scanner = new Scanner(System.in);

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		String j1 = scanner.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		// eliminamos Scanner s2 = new Scanner(System.in); porque nunca se usa.
		String j2 = scanner.nextLine();

		// Utilizamos equal para comparar las cadenas j1 y j2.
		if (j1.equals(j2)) {
			System.out.println("Empate");
		} else {
			int g = 2;

			// Añadimos break; al método Switch
			switch (j1) {
			case "piedra":
				if (j2 == "tijera") {
					g = 1;
				}
				break;
			case "papel":
				if (j2 == "piedra") {
					g = 1;
				}
				break;
			case "tijera":
				if (j2.equals("papel")) {
					g = 1;
				}
				break;
			default:
			}

			System.out.println("Gana el jugador " + g);
		}

		scanner.close();

	}

}
