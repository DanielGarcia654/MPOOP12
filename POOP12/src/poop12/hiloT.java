/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author poo01alu14
 */
public class hiloT extends Thread{

    public hiloT(String name) {
        super(name);
    }
    
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion "+(i+1)+" de "+getName());
        }
        System.out.println("Termina el "+getName());
    }
    
}
