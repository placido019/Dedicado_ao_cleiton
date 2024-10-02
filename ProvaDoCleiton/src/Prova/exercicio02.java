package Prova;

import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("----- Digite a quantidade de votantes -----");

        int n = sc.nextInt();

        System.out.println("Teremos: " + n + " votantes!");
        
        int[] votos = new int[n];
        
        for (int i = 0; i < n; i++) {
        	System.out.println("99 - Taffe");
        	System.out.println("88 - Rodrigo");
        	System.out.println("77 - Lucas");
        	System.out.println("66 - Alessandro");
            System.out.println("Digite seu voto " + (i + 1) + ": ");
            votos[i] = sc.nextInt();
           
        }
        
        System.out.println("Os votos foram: ");
        for (int i = 0; i < n; i++) {
            System.out.println("Voto " + (i + 1) + ": Candidato " + votos[i]);
        }

       

    }
}
