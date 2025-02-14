/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuProjetoJava;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Eletronic extends Product {
    int tensao;
    
    
    public Eletronic(String name, double price, int tensao ) {
    super(name, price);
    this.tensao = tensao;
    
    }
    
    public int getTensao() {
        return tensao;
    }
    
    
}
