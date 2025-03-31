import src.main.java.IMC.IMC;
import MassAndCircunference.calcCircuAndMass;

import java.util.Scanner;

public static void main(String[] args) {
    calcCircuAndMass CalcCircuAndMass = new calcCircuAndMass();
    IMC CalculandoImc = new IMC(); // chamando a minha classe responsavel pela soma do IMC
    Scanner scanner = new Scanner(System.in); // iniciando o scanner
    System.out.println(CalculandoImc.ImcCalculo(60.00, 1.75)); // exibo no console o valor já passando 2 parametros

    System.out.println("escolha qual calculo você deseja:");
    System.out.println("Volume/circuferencia:1");


    int escolherCalculo = 0;
    while (true) {
        System.out.println("escolha qual calculo você deseja:");
        System.out.println("Volume/circuferencia:1");

        escolherCalculo = scanner.nextInt();

        if (escolherCalculo == 1) {
            System.out.println("Me diga o raio para que eu possa calcular a circunferência e o volume.");
            double radius = scanner.nextDouble();
            double circunference = calcCircuAndMass.circunferenceCalc(radius);
            System.out.println(circunference);
        } else if (escolherCalculo == 2) {

        }

    }


}