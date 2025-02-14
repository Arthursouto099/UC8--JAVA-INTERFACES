/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excOne;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Calculator {
    
    private ArrayList<String> historic = new ArrayList<>();
    
    
    
    public Calculator() {
        
    }
    
    public void runCalculator(String operator, int inputOne, int inputTwo) {
        
        switch(operator) {
            case "+":
                int result = this.sum(inputOne, inputTwo);
                this.addHistoric("O Resultado � " + result);
                System.out.println("O Resultado � " + result);
            break;
            case "*":
                int resultOfMultiplation = this.multiplication(inputOne, inputTwo);
                this.addHistoric("O Resultado � " + resultOfMultiplation);
                System.out.println("O Resultado � " + resultOfMultiplation);
            break;
            case "/":
                int resultOfToDivide = this.toDivide(inputOne, inputTwo);
                this.addHistoric("O Resultado � " + resultOfToDivide);
                System.out.println("O Resultado � " + resultOfToDivide);
            break;
            case "-":
                int resultOfSubtracion = this.subtracion(inputOne, inputTwo);
                this.addHistoric("O Resultado � " + resultOfSubtracion);
                System.out.println("O Resultado � " + resultOfSubtracion);
            break;
            
            default:
                System.out.println("Operador n�o existe");
            break;
        }
    
        
    }
    
    public List<String> getHistoric() {
        return this.historic;
    }
    
    public void printHistoric() {
        for(int i = 0; i < this.historic.size(); i++) {
            System.out.println(this.historic.get(i));
        }
    }
    
    public void  addHistoric(String value) {
       this.historic.add(value);
    }
    
    
    public int sum(int firstValue,  int secondValue) {
        return firstValue + secondValue;
    }
    
    public int multiplication(int  firstValue, int secondValue) {
        return firstValue * secondValue;
    }
    
    public int toDivide(int dividend, int divider ) {
        
        try {
        if(dividend == 0) {
            System.out.println("Burro do caralho, hoje n�o pau no cu");
            throw new ArithmeticException();
        }
        
        else {
               return dividend / divider; 
        }
        
        }
        
        catch(ArithmeticException e) {
            System.out.println("pau no cu, dividir por zero??????/");
        }
        
        return 0;
       
 
    }
    
    public int subtracion(int value,  int subtractor) {
        return value - subtractor;
    }
}
