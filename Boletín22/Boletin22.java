import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Boletin22 {
    public static void main(String[] args) {
        Metodos mtd = new Metodos();
        Random rm = new Random();
        String [] equipos = {"Alaves","Almería","Athletic","Atlético","Barcelona","Betis","Cádiz","Celta","Getafe","Girona","Granada","Las Palmas","Mallorca","Osasuna","R.Sociedad","Rayo","Real Madrid","Sevilla","Valencia","Villareal"};
        int [][] goles = mtd.ponerGoles(rm);
        Map<String,int[]> golesJornada = new HashMap<>();
        golesJornada = mtd.juntasEquiposYGoles(equipos, goles);
        for (Map.Entry<String,int[]> entrada : golesJornada.entrySet()) {
            int [] gol = entrada.getValue();
            System.out.println(entrada.getKey() + ": " );
            int ii = 0;
            for (int i : gol) {
                System.out.print("Jornada  "+ ++ii + "\t" );
                System.out.println( i + " goles");                
            }
            System.out.println();
        }
        Map<String, Integer> totalGolesPorEquipo = new HashMap<>();
            for (int i = 0; i < equipos.length; i++) {
            int suma = 0;
                for (int j = 0; j < goles[i].length; j++) {
                 suma += goles[i][j];
                }
            totalGolesPorEquipo.put(equipos[i], suma);
            }
        List<Map.Entry<String, Integer>> listaOrdenada = new ArrayList<>(totalGolesPorEquipo.entrySet());
        listaOrdenada.sort(Map.Entry.comparingByValue());
        System.out.println("Equipos ordenados por total de goles de menor a mayor:");
        for (Map.Entry<String, Integer> entry : listaOrdenada) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " goles");
        }
        int valorMaximo = totalGolesPorEquipo.values().iterator().next();
        String EquipoMaximo = null;        
        for (Map.Entry<String, Integer> entrada : totalGolesPorEquipo.entrySet()){
            if (valorMaximo < entrada.getValue()){
                valorMaximo = entrada.getValue();
                EquipoMaximo = entrada.getKey();
            }
            
        }
        System.out.println("Equipo que tuvo más goles: " + EquipoMaximo + "\nGoles: " + valorMaximo);
        // Ejemplo de consulta por equipo y jornada (requiere Scanner para interacción real)
        int indiceEquipo = 0; // Para Celta, como ejemplo
        int xornada = 2; // Para la jornada 3 (recuerda que los índices empiezan en 0)
        System.out.println("Goles de " + equipos[indiceEquipo] + " en la jornada " + xornada + ": " + goles[indiceEquipo][xornada-1]);

    }

}
