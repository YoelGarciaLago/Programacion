public class Genericos_3 {
    public static void main(String[] args) {
        contenedorNumerico cNint = new contenedorNumerico<Integer>();
        cNint.guardarNum(5);
        cNint.mostrarNum();
        contenedorNumerico cND = new contenedorNumerico<Double>();
        cND.guardarNum(5.324234);
        cND.mostrarNum();
    }
}
