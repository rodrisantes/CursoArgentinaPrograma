package Clase6;

import org.junit.Test;
import static org.junit.Assert.*;

public class Calculadora {

    public double Suma(double num1,double num2){
        return num1 + num2;
    }
    public double Resta(double num1,double num2){
        return num1 - num2;
    }

    public double Multiplicacion(double num1,double num2){
        return num1 * num2;
    }
    public double Dvision(double num1,double num2){
        return num1 / num2;
    }
    
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

public static void main(String[]args){
   
    }
}
