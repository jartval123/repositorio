
package DesarrolloPractica;


public class Calculadora {

    // Sobrecarga de método para sumar dos enteros
    public int sumar(int a, int b) {
        return a + b;
    }

    // Sobrecarga de método para sumar tres enteros
    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    // Sobrecarga de método para sumar dos números flotantes
    public float sumar(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Crear una instancia de la clase Calculadora
        Calculadora calculadora = new Calculadora();

        // Probar la sobrecarga de sumar con dos enteros
        int resultadoEnteros = calculadora.sumar(5, 3);
        System.out.println("Suma de dos enteros: " + resultadoEnteros);

        // Probar la sobrecarga de sumar con tres enteros
        int resultadoTresEnteros = calculadora.sumar(5, 3, 2);
        System.out.println("Suma de tres enteros: " + resultadoTresEnteros);

        // Probar la sobrecarga de sumar con dos flotantes
        float resultadoFlotantes = calculadora.sumar(5.5f, 3.3f);
        System.out.println("Suma de dos flotantes: " + resultadoFlotantes);
    }
}
