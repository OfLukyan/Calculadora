import src.main.java.IMC.IMC;

import java.util.Scanner;

public static void main(String[] args){
    IMC CalculandoImc = new IMC(); // chamando a minha classe responsavel pela soma do IMC
    Scanner scanner = new Scanner(System.in); // iniciando o scanner
    System.out.println(CalculandoImc.ImcCalculo(60.00, 1.75)); // exibo no console o valor já passando 2 parametros
}