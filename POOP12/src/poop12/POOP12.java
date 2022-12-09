/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author poo01alu14
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        hiloT primero = new hiloT("Primer hilo");
        primero.start();
        new hiloT("Segundo hilo").start();
        
        new Thread(new hiloR(), "Tercer hilo").start();
        new Thread(new hiloR(), "Cuarto hilo").start();
        */
        
        for (int i = 0; i < 50; i++) {
            new Cuenta("Retiro 1").start();
            new Cuenta("Retiro 2").start();
        
            new Cuenta("Deposito 1").start();
            new Cuenta("Deposito 2").start();
        }
        
        
    }
    
}
