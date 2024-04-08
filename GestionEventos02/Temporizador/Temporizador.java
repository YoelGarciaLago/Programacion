import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temporizador {
    public static void main(String[] args) {
        final String[] mensajes = {"Inicio"};
        final int[] cuentaDeMensajes = {0};


        ActionListener taskPerformer = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (cuentaDeMensajes[0] >= 11) {
                    ((Timer) e.getSource()).stop();
                    System.exit(0);
                } else {
                    if (cuentaDeMensajes[0] >= 8) {
                        mensajes[0] = "Cambio";
                    }
                    else if (cuentaDeMensajes[0] >= 5){
                        mensajes[0] = "tu mama";
                    }
                   
                    System.out.println(mensajes[0]);
                    cuentaDeMensajes[0]++;
                }
            }
        };

        Timer timer = new Timer(2000, taskPerformer);
        timer.setRepeats(true);
        timer.start();


        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}