package br.com.dio.exceptions;

import javax.swing.*;

//Fazer a divisão de 2 valores inteiros
public class UncheckedException {
    String a = JOptionPane.showInputDialog("Numerador: 20");
    String b = JOptionPane.showInputDialog("Denominador: 10");
try{
    int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
    System.out.printIn("Resultado: " + resultado);
} catch (NumberFormatException e) {
    JOptionPane.showMessageDialog( parentComponent: null, message:"Entrada inválida, informe um número inteiro!" + e.getMessage());
    //e.printStackTrace();
}
finally {
    System.out.printIn("Chegou no finally!");
}
    System.out.printIn("O código continua...");
}

public static int dividir(int a, int b) { 
    return a / b;
}

}