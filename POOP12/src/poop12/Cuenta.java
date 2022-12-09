/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author poo01alu14
 */
public class Cuenta extends Thread{
    private static double saldo;

    public Cuenta(String name) {
        super(name);
        saldo = 0;
    }

    public static double consultaSaldo() {
        return saldo;
    }

    public synchronized void depositarDinero(double monto) {
        saldo += monto;
        System.out.println("Depositando ... $ "+saldo);
        notifyAll();
    }
    
    public synchronized void retirarDinero(double monto){
        if(monto>saldo){
            System.out.println(getName()+" debe esperar un deposito");
            System.out.println("Saldo: $ "+saldo);
            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else{
            saldo-=monto;
            System.out.println(getName()+" la cantidad extraida: "+monto);
            System.out.println("Saldo: $ "+saldo);
        }
        notifyAll();
    }
    
    public void run(){
        if(getName().equals("Deposito 1") || getName().equals("Deposito 2")){
            this.depositarDinero(100);
        }else{
            this.retirarDinero(50);
        }
    }
    
}
