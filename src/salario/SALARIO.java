/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salario;

import java.util.Scanner;

/**
 *
 * @author th4le
 */
public class SALARIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        double salario, ir, bonus, salarioLiquido;
        String nome;

        System.out.println("Insira seu nome: ");
        nome = teclado.nextLine();
        System.out.println("Insira o seu salário atual:");
        salario = teclado.nextDouble();

        bonus = salario * 0.055;

        salarioLiquido = salario + bonus;
        if (salarioLiquido <= 3500) {
            ir = salarioLiquido * 0.035;
        } else {
            ir = salarioLiquido * 0.075;
        }

        System.out.println("Nome:" + nome + "\n"
                + "Salário Bruto:" + salario + "\n"
                + "bonus:" + bonus + "\n"
                + "ir:" + ir + "\n"
                + "Salario Liquido:"+salarioLiquido);
    }
    
}
