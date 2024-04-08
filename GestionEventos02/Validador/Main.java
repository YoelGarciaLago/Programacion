package validacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validador valido = new Validador() {
            @Override
            public boolean validar(int numero) {
                return numero % 2 == 0;
            }
        };

        int numero;
        do {
            
            System.out.println("¿Par o impar?");
            System.out.println("Pon un numero (0 para salir):");
            while (!scanner.hasNextInt()) {
                System.out.println(":V");
                scanner.next();
            }
            
            numero = scanner.nextInt();
            
            if(numero!=0) {
                if (valido.validar(numero)) {
                    System.out.println("Par.");
                } else {
                    System.out.println("Impar.");
                }
            }
        } while (numero != 0);

    }
}