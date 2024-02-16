/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletín23_5;

/**
 *
 * @author dam1
 */
public class Boletín23_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String cadea = "java java java";
        cadea = cadea.replace(" ", "");
        int vocales = 0, consonantes = 0;
        for (int i = 0; i < cadea.length(); i++){
            char caracter = cadea.charAt(i);
            if(Character.isLetter(caracter)){
                if(verVocal(caracter))
                    vocales++;
                
                else
                    consonantes++;
            }
    }
        System.out.println("Vocales: " + vocales + "\nConsonantes: " + consonantes);
    }
    static boolean verVocal (char c){
        
        return c=='a' || c=='e' || c=='i' || c=='o' || c=='u';
    }
    
}
