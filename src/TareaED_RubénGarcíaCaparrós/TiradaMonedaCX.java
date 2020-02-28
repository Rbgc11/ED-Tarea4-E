
package TareaED_RubénGarcíaCaparrós;

import java.util.Scanner;

public class TiradaMonedaCX {

	public static void main(String[] args) {
//las variables a y b servirán para guardar el resultado de la tirada de dos monedas
		int operador1, operador2;
		int contadorCaras = 0, contadorCruces = 0, numTiradas;
//las variables contador1 y contador2 servirán para guardar el número de caras y cruces dobles consecutivas
		int resultado1 = 0, resultado2 = 0;
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
			operador1 = (int) (Math.random() * 2);
			operador2 = (int) (Math.random() * 2);

			if (operador1 == 0) {
				contadorCaras++;
				lanzamiento1 = "cara";
			} else {
				contadorCruces++;
				lanzamiento1 = "cruz";
			}
			if (operador2 == 0) {
				contadorCaras++;
				lanzamiento2 = "cara";
			} else {
				contadorCruces++;
				lanzamiento2 = "cruz";
			}
			System.out.println("Moneda 1: " + lanzamiento1 + ", Moneda 2: " + lanzamiento2);

			if (operador1 == operador2) {
				if (operador1 == 0) {
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
				resultado1++;
				if (resultado1 > maximoCarasDoblesConsecutivas) {
					maximoCarasDoblesConsecutivas = resultado1;
				}
			} else {
				resultado1 = 0;
			}

			if (esCruzDoble) {
				resultado2++;
				if (resultado2 > maximoCrucesDoblesConsecutivas) {
					maximoCrucesDoblesConsecutivas = resultado2;
				}
			} else {
				resultado2 = 0;
			}
		}

		System.out.println("Caras: " + contadorCaras + ", Cruces: " + contadorCruces);
		System.out.println("Maximo de caras dobles consecutivas: " + maximoCarasDoblesConsecutivas);
		System.out.println("Maximo de cruces dobles consecutivas: " + maximoCrucesDoblesConsecutivas);
	}
}
