/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos2;
/**
 *
 * @author dam1
 */
public class wawa <T> {

    public <T> void intercambio (T[] lista, int posicionI, int posicionJ){
        T aux;
        aux = lista[posicionI];
        lista[posicionI] = lista[posicionJ];
        lista[posicionJ] = aux;
        for(T i : lista){
            System.out.println(i);
        }
    }

    int[] intercambio(int[] lista, int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}


/*
[0][1]2---> [1][0] 4

[0][1]4 ----[1][0] 2
*/