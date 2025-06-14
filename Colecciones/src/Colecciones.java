import java.util.ArrayList;

package Colecciones;


public class Colecciones {
    public int sumarLista(ArrayList<Integer> lista) {
        int suma = 0;
        for (int num : lista) {
            suma += num;
        }
        return suma;
    }
   
    public static void main(String[] args) {
        Colecciones colecciones = new Colecciones();
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);

        System.out.println("La suma es: " + colecciones.sumarLista(lista));
    }
}
