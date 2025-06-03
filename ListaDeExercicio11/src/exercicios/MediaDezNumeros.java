package exercicios;

import java.util.Scanner;

public class MediaDezNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            double numero = sc.nextDouble();
            soma += numero;
        }

        double media = soma / 10;
        System.out.println("A média dos 10 números é: " + media);

        sc.close();
    }
}