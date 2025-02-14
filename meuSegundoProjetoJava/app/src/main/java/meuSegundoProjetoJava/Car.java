/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuSegundoProjetoJava;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Car extends Vehicle {
    int quantityPorts;
    
    public Car(String brand, double wheight, int quantityPorts) {
        super(4, brand, wheight);
        this.quantityPorts = quantityPorts;
    }
    
    public void maneuver( ) {
        System.out.println("IIIIIIIIIIIIIIIIIIIIIIIRRRRRRRRRRRRRRRRHHHHHHHHHHH");
    }
    
    @Override
    public void  run() {
        System.out.println("O carro da marca " + this.getBrand() + " está andando");
    }
    
    
}
