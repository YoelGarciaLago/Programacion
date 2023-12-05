/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletín17;
import javax.swing.JOptionPane;
/**
 *
 * @author dam1
 */
public class Conta {
    private double saldo, ingreso, retirada;
    private int nConta,resp;
    private Persona cliente;

    public Conta (int nConta, Persona cliente) {
        this.nConta = nConta;
        this.cliente = cliente;
    }

    public Conta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Conta{" + "saldo=" + saldo + ", nConta=" + nConta + ", cliente=" + cliente + '}';
    }
    
    public double ingresar(){
         ingreso=Double.parseDouble(JOptionPane.showInputDialog("Cuanto quieres ingresar?"));
        saldo+=ingreso;
        JOptionPane.showMessageDialog(null, "Su saldo será:"+ String.format("%.2f", saldo) );    
        return saldo;
    }
    
    public double retirada(){
        if(saldo<=0){
            JOptionPane.showMessageDialog(null, "No tienes saldo para retirar");
        }
         retirada=Double.parseDouble(JOptionPane.showInputDialog("Cuanto quieres retirar?"));
        if(retirada>saldo){
            do{
            retirada=Double.parseDouble(JOptionPane.showInputDialog("No puedes retirar tanto dinero"));
            }while((retirada>saldo));
        }
        saldo-=retirada;
        JOptionPane.showMessageDialog(null , "Su saldo queda en: "+saldo);

        return saldo;
        
    }
    
    public void actualizarSaldo(double saldo){
        this.saldo=saldo;
        
    }
    
    
    
    
    public void procesoBancario(){
        Conta ob=new Conta();
        do{
            JOptionPane.showMessageDialog(null, "Hola buenas, procederemos a crear su cuenta bancaria");
            String nom=JOptionPane.showInputDialog("Nombre");
            if(nom==null){
                 do{
                     nom= JOptionPane.showInputDialog("Tienes que poner un nombre");
                 }while(nom==null);
            }
            String apel=JOptionPane.showInputDialog("Apellidos");
            if(apel==null){
                do{
                apel=JOptionPane.showInputDialog("Tienes que poner apellidos");
                }while(apel==null);
            }
            int NIF=Integer.parseInt(JOptionPane.showInputDialog("NIF"));
            if(NIF<=0){
                do{
                NIF=Integer.parseInt(JOptionPane.showInputDialog("Tienes que poner el NIF"));
                }while(NIF<=0);
            }
            
            Persona obj =new Persona (nom,apel,NIF);
            
            JOptionPane.showMessageDialog(null, "Buenas señor/a "+obj.getNombre());
            
            int resp01=JOptionPane.showConfirmDialog(null,"Quieres ingresar saldo?");
            if(resp01==JOptionPane.YES_OPTION){
                saldo=ob.ingresar();
            }
            if(resp01==JOptionPane.NO_OPTION){
                int resp02=JOptionPane.showConfirmDialog(null, "Tienes saldo?");
                if (resp02==JOptionPane.YES_OPTION){
                    saldo=Double.parseDouble(JOptionPane.showInputDialog("Cuanto saldo tienes?"));
                }
                if(resp02==JOptionPane.NO_OPTION){
                    int resp03=JOptionPane.showConfirmDialog(null, "Tiene que ingresar una cantidad para poder continuar \n¿Quieres ingresar para continuar?");
                    if(resp03==JOptionPane.YES_OPTION){
                        saldo=ob.ingresar();
                    }
                    if(resp03==JOptionPane.NO_OPTION)
                        break;
                    
                }
            }
            
            JOptionPane.showMessageDialog(null, "Ahora mismo su cuenta alberga "+saldo+ " de saldo");
            int resp04=JOptionPane.showConfirmDialog(null, "Quiere retirar saldo de su cuenta?");
            if(resp04==JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null, "Operación abortada");
                break;
            }
               
            if(resp04==JOptionPane.YES_OPTION){
                saldo=ob.retirada();
            }
            if(resp04==JOptionPane.NO_OPTION)
                JOptionPane.showMessageDialog(null, "De acuerdo, no se retirará nada");
                
            JOptionPane.showMessageDialog(null, "Ahora mismo tendrá que decidir si quiere tener una cuenta corriente o una de ahorros");
           
            int i=Integer.parseInt(JOptionPane.showInputDialog("Elige el tipo de cuenta \n1=Cuenta ahorros \n2=Cuenta corriente"));
            switch(i){
                case 1 -> {
                    CuentaAhorro obk=new CuentaAhorro();
                    JOptionPane.showMessageDialog(null, "Se procederá a crear una cuenta de ahorros");
                    
                    int anos=obk.añosTotales();
                    
                    
                    
                    double interesVar=anos-anos*0.7;
                    JOptionPane.showMessageDialog(null, "Usd tendrá un interés del "+String.format("%.2", interesVar)+ " % por los "+anos+ " años");
                }
                case 2 -> {
                    CuentaCorriente obl=new CuentaCorriente();
                    JOptionPane.showMessageDialog(null, "Se procederá a crear una cuenta corriente");
                    JOptionPane.showMessageDialog(null, "Usd tendrá un interés anual del "+obl.getInteres()+"%");
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Error, el programa se volverá a ejecutar.\nSe tendrán que volver a introducir los datos");
                    resp=JOptionPane.YES_OPTION;
                }
            }
            JOptionPane.showMessageDialog(null, "Gracias por usar nuestro servicio :)");
            
            

            
            
         resp= JOptionPane.showConfirmDialog(null, "Quieres seguir?");
         if(resp==JOptionPane.YES_OPTION){
            saldo=0;
            ingreso=0;
            retirada=0;
         }
         else
             break;
            
        }while(resp==JOptionPane.YES_OPTION );
        if(resp!=JOptionPane.YES_OPTION){
            System.exit(0);
        }
            
        
         
    }
 
    
}
