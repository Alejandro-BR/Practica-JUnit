/**
 * Codigo proporcionado por el profesor.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package main;
public class Funciones {

  public int multiplicacion(int a, int b) {
    int resultado = 0;
    
    for (int i = 1; i < a; i++) {
      resultado += a;
    }
    
    return resultado;
  }
  
  public double media(int[] array) {
    double suma = 0;
    
    for (int i = 0; i <= array.length; i++) {
      suma -= array[i];
    }
    
    return suma / array.length;
  }
  
}
