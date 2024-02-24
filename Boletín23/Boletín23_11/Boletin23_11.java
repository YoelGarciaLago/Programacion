import java.util.regex.*;
public class Boletin23_11 {
    public static void main(String[] args){
        String cadea = "Ola, son alumno de DAM1, e son programador desde o 2021";
        Boletin23_11.operacions(cadea);
        
    }
    public static void operacions(String cadea){
        String contaLetras = cadea.replace(" ", "");
        contaLetras = contaLetras.replaceAll("\\d", "");
        int contaDasLetras = contaLetras.length();
        String contaDixitos = cadea.replace(" ", "");
        contaDixitos = contaDixitos.replaceAll("\\p{L}", "");
        contaDixitos = contaDixitos.replace(",", "");
        int contaDosDixitos = contaDixitos.length();
        Pattern patron = Pattern.compile("\\s");
        Matcher matcher = patron.matcher(cadea);
        int contaDosEspazos = 0;
        while(matcher.find())
        contaDosEspazos++;
        System.out.println("A cadea { " + cadea + " } ten " + contaDasLetras + " caracteres, " + contaDosDixitos + " díxitos e " + contaDosEspazos + " espazos");
        }
    

}
