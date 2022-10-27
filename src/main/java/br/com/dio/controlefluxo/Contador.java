package br.com.dio.controlefluxo;

import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("CONTADOR ------------------------------------------>");

        System.out.print("Insira o primeiro parâmetro: ");
        int parametroUm = sc.nextInt();

        System.out.print("Insira o segundo parâmetro: ");
        int parametroDois = sc.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro.");

        } finally {
            System.out.println("--------------------------------------------------->");
            sc.close();
        }
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }

        int contagem = parametroDois - parametroUm;

        System.out.println("\nImprimindo...");

        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

}