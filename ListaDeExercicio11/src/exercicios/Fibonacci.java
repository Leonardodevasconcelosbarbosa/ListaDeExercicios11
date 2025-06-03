package exercicios;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a = 1, b = 1;

        System.out.print("Sequência de Fibonacci (10 primeiros termos): ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int proximo = a + b;
            a = b;
            b = proximo;
        }
    }
}