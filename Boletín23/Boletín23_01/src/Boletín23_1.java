public class Boletín23_1 {
    public static void main(String[] args){
        int n;
        String cadena = "Esto é Java";
        String newCadena = cadena.replace(" ", "");
        n = newCadena.length();
        System.out.println("La cadena [ " + cadena + " ] tiene " + n + " caracteres");
    }
}
