/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uc_atividade;

/**
 *
 * @author Lorenzo_alt
 */

public class InsertionSort {
    public static void main(String[] args) {
        String[] vetor = {"O", "R", "D", "E", "N", "A"};
        
        System.out.println("Lista pré ordenação:");
        imprimir(vetor);

        insertionSort(vetor);

        System.out.println("\nLista ordenada:");
        imprimir(vetor);
    }

    public static void insertionSort(String[] vetor) {
        int n = vetor.length;

        System.out.print("\nProcesso: ");
        for (int i = 1; i < n; i++) {
            String chave = vetor[i];
            int j = i - 1;

            while (j >= 0 && vetor[j].compareToIgnoreCase(chave) > 0) {
                vetor[j + 1] = vetor[j];
                j--;
            }

            vetor[j + 1] = chave;
            
            System.out.println("");
            imprimir(vetor);
        }
    }

    public static void imprimir(String[] vetor) {
        System.out.print("{ ");
        for (String elemento : vetor) {
            System.out.print('"' + elemento + '"' + " ");
        }
        System.out.print("}");
    }
}

