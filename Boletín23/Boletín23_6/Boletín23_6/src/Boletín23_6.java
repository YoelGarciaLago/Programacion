public class Boletín23_6 {
    public static void main(String[] args){
        String cadea = "www.javadende0.com";
        String primeraParte = cadea.substring(0, 8);
        String segundaParte = cadea.substring(8);
        System.out.println(primeraParte);
        System.out.println(segundaParte);
        System.out.println(primeraParte + segundaParte);
    }
}
