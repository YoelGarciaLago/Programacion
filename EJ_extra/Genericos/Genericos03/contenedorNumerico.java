import java.util.ArrayList;
public class contenedorNumerico <T extends Number> {
    ArrayList <T> lista = new ArrayList<>();
    public void guardarNum (T numero){
        lista.add(numero);
    }

    public void mostrarNum(){
        T aux = lista.get(0);
        System.out.println(aux);
    }
}
