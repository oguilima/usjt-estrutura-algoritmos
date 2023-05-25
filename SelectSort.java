public class SelectSort {
    public static void main(String[] args) {
        char vet[] = {'O', 'R', 'D', 'E', 'N','A'};


        System.out.println("Vetor de entrada: ");
        System.out.println(vet);
        System.out.println("***************");
        System.out.println("Etapas de oredenação: ");
        System.out.println("***************");
        System.out.println(selectionSort(vet));
        System.out.println("***************");
        System.out.println("Vetor ordenado: ");
        System.out.println(vet);  
    }


    static char[] selectionSort(char[] vetor) {
        int n = vetor.length;


        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;


           
            for (int j = i + 1; j < n; j++) {
                if (vetor[j] < vetor[minIndex]) {
                    minIndex = j;
                }
            }


            char aux = vetor[minIndex];
            vetor[minIndex] = vetor[i];
            vetor[i] = aux;


            System.out.println(vetor);
        }
        return vetor;
    }
 
}
