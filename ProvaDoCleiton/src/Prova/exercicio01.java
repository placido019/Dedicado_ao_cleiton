package Prova;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Digite a quantidade de filmes que você deseja avaliar -----");

        int n = sc.nextInt();

        double[] nota = new double[n];
        double soma = 0;

        
        for (int i = 0; i < n; i++) {
            System.out.println("Digite a nota do filme " + (i + 1) + ": ");
            nota[i] = sc.nextDouble();
            soma += nota[i]; 
        }

  
        double media = soma / n;

        
        System.out.println("As notas foram: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Filme " + (i + 1) + ": Nota " + nota[i]);
        }

        System.out.println("A média foi: " + media);

    }
}
