/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejemplo014 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Para poder presentar todo con un solo print es necesario inicializar
        // una variable cadena y asi presentar lo solicitado.
        
        // Iniciar una variable cadena
        int cadenaFinal = 0;

        for (int i = 1; i <= 10; i++) {
            cadenaFinal = cadenaFinal + i;
        }
        
        for (int i = 1; i < 11; i++) {
            cadenaFinal = cadenaFinal + i;
        }
        
        System.out.printf("%s",cadenaFinal);

    }

}
