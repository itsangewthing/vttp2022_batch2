package myapp.core;

import java.io.Console;

public class E1 {

   public static void main (String[] args) {
    Console cons = System.console();
    String operand1 = cons.readLine("Operand 1: ");
    String operand2 = cons.readLine("Operand 2: ");
    String operator = cons.readLine("Calculator:");
    int calculatorResult = 0;

    switch (operator) {
        case "add":
        calculatorResult = Integer.parseInt(operand1) + Integer.parseInt(operand2);
        System.out.printf("The result is %d", calculatorResult); 
        break;

        case "sub":
        calculatorResult = Integer.parseInt(operand1) - Integer.parseInt(operand2);
        System.out.printf("The result is %d", calculatorResult); 
        break;

        case "mul":
        calculatorResult = Integer.parseInt(operand1) * Integer.parseInt(operand2);
        System.out.printf("The result is %d", calculatorResult);
        break;

        case "div":
        calculatorResult = Integer.parseInt(operand1) / Integer.parseInt(operand2);
        System.out.printf("The result is %d", calculatorResult);
        break;

        default:  
    }
   }    
}
