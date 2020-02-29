
package TareaED_RubénGarcíaCaparrós;

import java.util.Scanner;

public class TiradaMonedaCX {

	public static void main(String[] args) {
//las variables a y b servirán para guardar el resultado de la tirada de dos monedas
		int Operador1, Operador2;
		int contadorCaras = 0, contadorCruces = 0, numTiradas;
//las variables contador1 y contador2 servirán para guardar el número de caras y cruces dobles consecutivas
		int cont1 = 0, cont2 = 0;
		int maximoCarasDoblesConsecutivas = 0, maximoCrucesDoblesConsecutivas = 0;
		boolean esCruzDoble = false, esCaraDoble = false;
		String lanzamiento1;
		String lanzamiento2;
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.print("Introduce el número de veces que se van a lanzar las monedas (max 50): ");
			numTiradas = teclado.nextInt();
		} while (numTiradas < 1 || numTiradas > 50);

		for (int i = 0; i < numTiradas; i++) {
			Operador1 = (int) (Math.random() * 2);
			Operador2 = (int) (Math.random() * 2);

			if (Operador1 == 0) {
				contadorCaras++;
				lanzamiento1 = "cara";
			} else {
				contadorCruces++;
				lanzamiento1 = "cruz";
			}
			if (Operador2 == 0) {
				contadorCaras++;
				lanzamiento2 = "cara";
			} else {
				contadorCruces++;
				lanzamiento2 = "cruz";
			}
			System.out.println("Moneda 1: " + lanzamiento1 + ", Moneda 2: " + lanzamiento2);

			if (Operador1 == Operador2) {
				if (Operador1 == 0) {
					esCaraDoble = true;
					esCruzDoble = false;
				} else {
					esCaraDoble = false;
					esCruzDoble = true;
				}
			} else {
				esCaraDoble = false;
				esCruzDoble = false;
			}

			if (esCaraDoble) {
				cont1++;
				if (cont1 > maximoCarasDoblesConsecutivas) {
					maximoCarasDoblesConsecutivas = cont1;
				}
			} else {
				cont1 = 0;
			}

			if (esCruzDoble) {
				cont2++;
				if (cont2 > maximoCrucesDoblesConsecutivas) {
					maximoCrucesDoblesConsecutivas = cont2;
				}
			} else {
				cont2 = 0;
			}
		}

		Imprime(contadorCaras, contadorCruces, maximoCarasDoblesConsecutivas, maximoCrucesDoblesConsecutivas);
	}

	/**
	 * @param contadorCaras
	 * @param contadorCruces
	 * @param maximoCarasDoblesConsecutivas
	 * @param maximoCrucesDoblesConsecutivas
	 * @deprecated Use {@link #Imprime(int,int,int,int)} instead
	 */
	public static void Imprimir(int contadorCaras, int contadorCruces, int maximoCarasDoblesConsecutivas,
			int maximoCrucesDoblesConsecutivas) {
				Imprime(contadorCaras, contadorCruces, maximoCarasDoblesConsecutivas, maximoCrucesDoblesConsecutivas);
			}

	/**
	 * @param contadorCaras
	 * @param contadorCruces
	 * @param maximoCarasDoblesConsecutivas
	 * @param maximoCrucesDoblesConsecutivas
	 */
	public static void Imprime(int contadorCaras, int contadorCruces, int maximoCarasDoblesConsecutivas,
			int maximoCrucesDoblesConsecutivas) {
		System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
		System.out.println("Maximo de caras dobles consecutivas: " + maximoCarasDoblesConsecutivas);
		System.out.println("Maximo de cruces dobles consecutivas: " + maximoCrucesDoblesConsecutivas);
	}
}
