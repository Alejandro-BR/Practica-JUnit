/**
 * Este codigo proporcionado por el profesor
 * fue modificado para poder pasar las pruebas realizadas
 * y tambien documentado.
 * 
 * Se corrigio ambos bucles de las dos funciones y se le añadio codigo extra a multiplicacion
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package main;

public class Funciones {

  /**
   * Funcion de multiplicacion de enteros
   * 
   * @param a int
   * @param b int
   * @return int
   */
  public static int multiplicacion(int a, int b) {
    int resultado = 0;

    // En caso de multiplicar por 0
    if ((a == 0) || (b == 0)) {
      return resultado;
    }

    // En caso de multiplicar dos numeros negativos
    if ((a < 0) && (b < 0)) {
      a *= -1;
      b *= -1;
    }

    for (int i = 1; i <= b; i++) {
      resultado += a;
    }

    return resultado;
  }


  /**
   * Funcion para el calculo de la media
   * 
   * @param array int[]
   * @return double
   */
  public static double media(int[] array) {
    double suma = 0;

    for (int i = 0; i < array.length; i++) {
      suma += array[i];
    }

    return suma / array.length;
  }

}
