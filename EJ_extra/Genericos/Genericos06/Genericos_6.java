public class Genericos_6 {
    public static void main(String[] args){
        metodos<Integer> mtd = new metodos<>();
        Integer [] lista = {1,2,3,0,4,5,6,9};
        int max = mtd.encontrarMaximo(lista);
        System.out.println(max);
        metodos<String> mtdS = new metodos<>();
        String [] listaS = {"a",",,a","wawa"};
        String maxS = mtdS.encontrarMaximo(listaS);
        System.out.println(maxS);
    }
}
