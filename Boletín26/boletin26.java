package boletin26_1;

public class Boletin26_1 {

    public static void main(String[] args) {
        Numeros n= new Numeros();
        n.iniciarArray();

        Operaciones op= new Operaciones();
        System.out.println(op.minimo(n.getNumeros()));
        System.out.println(op.maximo(n.getNumeros()));
        System.out.println(op.buscar(n.getNumeros(), n.getNumeros().get(5)));
        System.out.println(n.toString());
        op.borrarPrimeraAparicion(n.getNumeros(), n.getNumeros().get(5));
        System.out.println(n.toString());
    }

}
