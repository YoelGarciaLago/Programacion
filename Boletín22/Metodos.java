import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Metodos {
    public int[][] ponerGoles (Random rm){
        //El 1er elemento del array son los equipos, el 2do es el nº de jornadas
        int goles[][] = new int [20][38];
        for (int i = 0; i < 20 ; i++){
            for(int j = 0; j < 38; j++){
                goles[i][j] = rm.nextInt(7);
            }
            
        }
        return goles;
    }
    public Map<String,int[]>  juntasEquiposYGoles (String equipos[], int goles[][]){
        Map<String,int[]> mapa = new HashMap <>();
        for (int i = 0 ; i < equipos.length && i < goles.length ; i++){
            mapa.put(equipos[i], goles[i]);
        } 
        return mapa;
    }
    
}
