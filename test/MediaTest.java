/**
 * Pruebas realizadas para la funcion media de la clase Funciones.
 * Para su realizacion se utilizara la herramienta JUnit, dicha  libreria debera ser descargada.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import main.Funciones;

public class MediaTest {

  // Prueba de funcionamiento normal

  @Test
  public void mediaTest() {
    int[] numeros = { 1, 6, 5, 9, 2 };
    double resultado = Funciones.media(numeros);
    assertEquals(4.6, resultado, 0.1);
  }

  // Prueba con numeros negativos

  @Test
  public void mediaConNegativosTest() {
    int[] numeros = { -5, 6, -2, 10, 2 };
    double resultado = Funciones.media(numeros);
    assertEquals(2.2, resultado, 0.1);
  }

  // Prueba con solo numeros negativos

  @Test
  public void mediaNegativosTest() {
    int[] numeros = { -5, -6, -2, -10, -8 };
    double resultado = Funciones.media(numeros);
    assertEquals(-6.2, resultado, 0.1);
  }
}
