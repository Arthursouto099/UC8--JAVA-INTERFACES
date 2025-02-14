/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package meuSegundoProjetoJava;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Frase {
    Scanner sc = new Scanner(System.in);
    
    
    public Frase() {
        
    }
    
    public String  returnFrase() {
        System.out.println("Digite sua frase");
        String phrse = sc.nextLine();
        return phrse;
    }
    
    public int returnLength(String phrse) {
       int length = phrse.length();
      
//       String trim = split[0] + split[1];;
       
       
//       List<String[]> list = new ArrayList<>();
       
       String[] split = phrse.split(" ", length);
//       list.add(split);

       String trim = "";
       
       for(int i = 0; i < split.length; i++) {
           trim += split[i];
       }
       
       int phrseLength = trim.length();
       return phrseLength;
    }
    
    public void printPhrse(String phrse) {
        System.out.print("\n");
        System.out.println("Phrse: " + phrse + "\n" + "Length: " + this.returnLength(phrse));
    } 
}
