import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o numero: ");
        int num = scanner.nextInt();

        int fibonacciAnterior = 0, fibonacciAtual = 1;

        while (true) {
            int fibonacciProximo = fibonacciAnterior + fibonacciAtual;

            fibonacciAtual = fibonacciAnterior;
            fibonacciAnterior = fibonacciProximo;

            if (fibonacciProximo > num) {
                System.out.println("O numero informado nao pertence a sequencia de fibonacci");
                break;
            }

            if (fibonacciProximo == num) {
                System.out.println("O numero informado pertence a sequencia de fibonacci");
                break;
            }
        }

        scanner.close();
    }
}
