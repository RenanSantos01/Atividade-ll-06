import java.util.Scanner;

class Numero {
    public boolean éImpar(int n) {
        return n % 2 != 0;
    }

    public boolean éPositivo(int n) {
        return n > 0;
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numero numero = new Numero();

        // Solicita ao usuário que insira um número inteiro
        System.out.println("Digite um número inteiro:");
        int num1 = scanner.nextInt();

        // Verifica se o número é ímpar e imprime o resultado
        if (numero.éImpar(num1)) {
            System.out.println(num1 + " é ímpar.");
        } else {
            System.out.println(num1 + " não é ímpar.");
        }

        // Solicita ao usuário que insira outro número inteiro
        System.out.println("Digite outro número inteiro:");
        int num2 = scanner.nextInt();

        // Verifica se o número é positivo e imprime o resultado
        if (numero.éPositivo(num2)) {
            System.out.println(num2 + " é positivo.");
        } else {
            System.out.println(num2 + " não é positivo.");
        }

        scanner.close();
    }
}
