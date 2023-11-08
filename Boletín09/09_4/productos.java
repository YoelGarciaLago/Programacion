/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín09_4;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class productos {
    private int n;
    Scanner sc= new Scanner(System.in);
    public void tablasMult(){
        do{
              
            System.out.println("nº?");
            n=sc.nextInt();
            System.out.println("Tablas de multiplicar: \n1X"+n+ ":"+(1*n)+ "\n2X"+n+":"+(2*n)+ "\n3X"+n+ ":"+ (n*3) + "\n4X"+n+":"+(n*4)+ "\n5X"+n+":"+(n*5)+"\n6X"+n+":"+(n*6)+"\n7x"+n+":"+(7*n)+ "\n8X"+n+":33"+(n*8)+ "\n9X"+n+":"+(n*9)+ "\n10X"+n +":"+(n*10));
            
            if(n<=0){
                System.out.println("Fin del programa");
            }
        }while(n>0);
    }
    
}
