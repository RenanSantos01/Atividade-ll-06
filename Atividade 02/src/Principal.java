import java.util.Scanner;

class Vetor {
    private int[] vetor;

    public void preencher(int n) {
        Scanner scanner = new Scanner(System.in);
        vetor = new int[n];
        System.out.println("Insira " + n + " números inteiros para preencher o vetor:");
        for (int i = 0; i < n; i++) {
            vetor[i] = scanner.nextInt();
        }
    }

    public int[] getVetor() {
        return vetor;
    }
}

class Matriz {
    private int[][] matriz;

    public void preencher(int m, int n) {
        Scanner scanner = new Scanner(System.in);
        matriz = new int[m][n];
        System.out.println("Insira os números inteiros para preencher a matriz de " + m + " linhas e " + n + " colunas:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
    }

    public int[][] getMatriz() {
        return matriz;
    }
}

class Verificador {
    public boolean éPar(int n) {
        return n % 2 == 0;
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Criando objeto da classe Vetor
        Vetor vetorObj = new Vetor();
        System.out.print("Informe o tamanho do vetor: ");
        int tamanhoVetor = scanner.nextInt();
        vetorObj.preencher(tamanhoVetor);
        
        // Criando objeto da classe Matriz
        Matriz matrizObj = new Matriz();
        System.out.print("Informe o número de linhas da matriz: ");
        int linhasMatriz = scanner.nextInt();
        System.out.print("Informe o número de colunas da matriz: ");
        int colunasMatriz = scanner.nextInt();
        matrizObj.preencher(linhasMatriz, colunasMatriz);
        
        // Criando objeto da classe Verificador
        Verificador verificadorObj = new Verificador();
        
        // Verificando e imprimindo paridade dos elementos do vetor
        System.out.println("Paridade dos elementos do vetor:");
        for (int num : vetorObj.getVetor()) {
            System.out.println(num + ": " + (verificadorObj.éPar(num) ? "Par" : "Ímpar"));
        }
        
        // Verificando e imprimindo paridade dos elementos da matriz
        System.out.println("\nParidade dos elementos da matriz:");
        for (int[] linha : matrizObj.getMatriz()) {
            for (int num : linha) {
                System.out.print(num + ": " + (verificadorObj.éPar(num) ? "Par" : "Ímpar") + "\t");
            }
            System.out.println();
        }
    }
}
