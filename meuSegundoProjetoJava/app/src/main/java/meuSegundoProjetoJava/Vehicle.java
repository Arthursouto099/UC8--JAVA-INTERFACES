/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuSegundoProjetoJava;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Vehicle {
    private int numberOfWheels;
    private String brand;
    private double weight;
    
    public Vehicle( int numberOfWeels, String brand, double weight) {
        this.numberOfWheels = numberOfWeels;
        this.brand = brand;
        this.weight = weight;
    }
    
    public void run() {
        System.out.println("O veiculo da marca " + this.brand + " está andando");
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
}
