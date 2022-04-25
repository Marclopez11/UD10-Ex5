package ej5;

public class Password {

	private static int longitud;
	private static char password;
	private static int minuscula = 0;
	private static int mayuscula = 0;
	private static int numeros = 0;
	private static char getAscii;
	private static int NumAleatorio;

	public Password() {
		super();
		this.longitud = 8;

	}

	public Password(int longitud) {
		super();
		this.longitud = longitud;
		this.password = generarPassword();
		;
	}

	// devuelve un booleano si es ferte o no, para que sea fuerte tiene que tener
	// mas de 2 mayusculas.
	// mas de una miniscuala y mas de 5 numeros

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public char getPassword() {
		return password;
	}

	public boolean esFuerte(String contrasenaa) {

		calcularSiEsFuerte(contrasenaa);
		if (mayuscula > 1 && minuscula > 1) {
			return true;
		} else {
			return false;
		}

	}

	public char generarPassword() {

			getAscii = 'A';
		for (int i = 1; i <= longitud; i++) {

			NumAleatorio = 32 + (int) (Math.random() * 92);
			getAscii = (char) NumAleatorio;
			if (i == longitud) {
				return getAscii;
			}

		}
		
		return getAscii;

	}

	public static void calcularSiEsFuerte(String contrasenaa) {

		// quitamos los numeros
		String passwordReviewer = "";

		passwordReviewer = contrasenaa.replaceAll("[^\\d]", "");
		// buscamos dos mayusculas;
		for (int i = 0; i < passwordReviewer.length(); i++) {
			if (passwordReviewer.toUpperCase().charAt(i) == passwordReviewer.charAt(i)) {
				mayuscula++;
			}
		}

		for (int i = 0; i < passwordReviewer.length(); i++) {
			if (passwordReviewer.toLowerCase().charAt(i) == passwordReviewer.charAt(i)) {
				minuscula++;
			}
		}

	}
	

	@Override
	public String toString() {
		return "Password" + password;
	}

}
