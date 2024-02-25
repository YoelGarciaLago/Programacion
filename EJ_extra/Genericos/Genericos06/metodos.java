public class metodos <T extends Comparable<T>>{
public T encontrarMaximo (T[] lista){
    if(lista == null || lista.length == 0){
        return null;
    }
    T max = lista[0];
    for (int i = 0; i < lista.length; i++){
        if (lista[i].compareTo(max) > 0){
            max = lista[i];
        }
    }
    return max;
}
    
}
