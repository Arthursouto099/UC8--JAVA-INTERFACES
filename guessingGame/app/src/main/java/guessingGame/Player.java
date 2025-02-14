/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guessingGame;
import java.util.Scanner;
/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Player {
    private String name;
    
    public Player() {
        Scanner mySc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        this.name = mySc.nextLine();
    }
    
    public String getName() {
        return this.name;
    }
}
