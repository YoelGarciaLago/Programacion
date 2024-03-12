package boletin26_1;
import java.util.List;

public class Operaciones<T extends Comparable<T>> {

    // Método para calcular el elemento mínimo de una lista
    public T minimo(List<T> lista) {
        if (lista.isEmpty()) {
            return null;
        }
        T min = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            T elemento = lista.get(i);
            if (elemento.compareTo(min) < 0) {
                min = elemento;
            }
        }
        return min;
    }

    // Método para calcular el elemento máximo de una lista
    public T maximo(List<T> lista) {
        if (lista.isEmpty()) {
            return null;
        }
        T max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            T elemento = lista.get(i);
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }
        return max;
    }

    // Método para buscar un objeto en una lista y devolver su posición
    // Devuelve -1 si el objeto no se encuentra en la lista
    public int buscar(List<T> lista, T objeto) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(objeto)) {
                return i;
            }
        }
        return -1;
    }
    // Método para borrar la primera aparición de un objeto dado en la lista
    // Devuelve el objeto eliminado o null si no lo encuentra
    public T borrarPrimeraAparicion(List<T> lista, T objeto) {
        int indice = lista.indexOf(objeto);
        if (indice != -1) {
            return lista.remove(indice);
        }
        return null;
    }
}
