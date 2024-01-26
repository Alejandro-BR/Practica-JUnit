/**
 * Pruebas realizadas para la funcion  multiplicacion clase Funciones.
 * Para su realizacion se utilizara la herramienta JUnit, dicha  libreria debera ser descargada.
 * 
 * @author Alejandro Barrionuevo Rosado
 */

package test;

import org.junit.Assert;
import org.junit.Test;
import main.Funciones;

public class MultiplicacionTest {

  // Prueba de funcionamiento normal

  @Test
  public void multiplicacionTest() {
    int numero1 = 2;
    int numero2 = 3;
    int resultado = Funciones.multiplicacion(numero1, numero2);
    Assert.assertEquals(6, resultado);
  }

  // Prueba de multiplicacion por cero

  @Test
  public void multiplicacionPor0Test() {
    int numero1 = 8;
    int numero2 = 0;
    int resultado = Funciones.multiplicacion(numero1, numero2);
    Assert.assertEquals(0, resultado);
  }

  // Prueba de multiplicacion por uno

  @Test
  public void multiplicacionPor1Test() {
    int numero1 = 5;
    int numero2 = 1;
    int resultado = Funciones.multiplicacion(numero1, numero2);
    Assert.assertEquals(numero1, resultado);
  }

  // Prueba de multiplicacion por un negativo

  @Test
  public void multiplicacionPorNegativosTest() {
    int numero1 = -8;
    int numero2 = 2;
    int resultado = Funciones.multiplicacion(numero1, numero2);
    Assert.assertEquals(-16, resultado);
  }

    // Prueba de multiplicacion de numeros negativos

    @Test
    public void multiplicacionNegativosTest() {
      int numero1 = -4;
      int numero2 = -5;
      int resultado = Funciones.multiplicacion(numero1, numero2);
      Assert.assertEquals(20, resultado);
    }

}
