import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

import Clase6.Calculadora;

public class CalculadoraTest {
    
    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.Multiplicacion(80, 3);
        assertEquals(240, resultado, 0);
    }


    @Test
    public void testSumarYDividir() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.Dvision(calculadora.Suma(150, 180), 3);
        assertEquals(110, resultado, 0);
    }

    @Test
    public void testRestarYMultiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.Resta(90, 50) * 15;
        assertNotEquals(605, resultado, 0);
    }


    @Test
    public void testSumarYMultiplicar() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.Suma(70, 40) * 25;
        assertNotEquals(2700, resultado, 0);
    }
}
