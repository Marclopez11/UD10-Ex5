package main;

import java.util.Scanner;

import ej5.Password;

public class main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int longitud = 0;
		String contraseña = "";
		System.out.println("Introduce la longitud para la array de contraseñas");
		int longitudarr = sc.nextInt();
		Password pass[] = new Password[longitudarr];
		String contraseñas[] = new String[longitudarr];

		System.out.println("La longitud de la array de contraseñas es de " + pass.length);

		for (int i = 0; i < pass.length; i++) {

			System.out.println("Introduce la longitud de la contraseña " + i);
			longitud = sc.nextInt();
			pass[i] = new Password(longitud);
			for (int j = 1; j <= longitud; j++) {
				contraseña += pass[i].generarPassword();

			}
			contraseñas[i] = contraseña;
			contraseña = "";
		}

		System.out.println("Mostrar Todas las contraseñas");

		// mostrar array de contraseñas y decir si es segura
		for (int i = 0; i < contraseñas.length; i++) {
			if (pass[i].esFuerte(contraseñas[i])) {

				System.out.println("La contraseña "+contraseñas[i]+" es fuerte");
			}else {
				System.out.println("La contraseña "+contraseñas[i]+" no fuerte");

			}

		}


	}

}
