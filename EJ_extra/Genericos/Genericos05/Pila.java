import java.util.ArrayList;

public class Pila <T> {
    ArrayList <T> lista = new ArrayList<>();

    public void push (T elemento){
        lista.add(elemento);
    }

    public T pop (){
        if (lista.size() == 0 ){
            return null;
        }
        lista.remove(lista.get(lista.size()-1));
        return lista.get(lista.size()-1);
    }

    public T peek (){
        if (lista.size() == 0 ){
            return null;
        }
        return lista.get(lista.size()-1);
    }

    public boolean estaVacia (){
        boolean muestra;
        if (lista.size() == 0){
            muestra = true;
        }
        else{
            muestra = false;
        }
        return muestra;
    }
}
