package boletin26_1;
import datos.LerDatos;
import java.util.ArrayList;

public class Numeros {
    private ArrayList<Integer> numeros = new ArrayList();

    public Numeros() {
    }

    public ArrayList<Integer> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    public void iniciarArray(){
        for(int i=0;i<10;i++){
            numeros.add(i, i+1);
        }
    }

    @Override
    public String toString() {
        return "Numeros{" + "numeros=" + numeros + '}';
    }

}
