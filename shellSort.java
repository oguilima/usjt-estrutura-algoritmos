public class ShellSort {
    public static void main(String[] args) {
        char vet[] = {'O', 'R', 'D', 'E', 'N','A'};
       
        System.out.println("Vetor de entrada: ");
        System.out.println(vet);
        System.out.println("***************");
        System.out.println("Etapas de oredenação: ");
        System.out.println("***************");
        System.out.println(shellSort(vet));
        System.out.println("***************");
        System.out.println("Vetor ordenado: ");
        System.out.println(vet);
       
    }


    static char[] shellSort(char[] letras) {
        int intervalo = letras.length / 2;
        while (intervalo > 0) {
            for (int i = intervalo; i < letras.length; i++) {
                int j = i;
                char letraTemporaria = letras[i];
                while (j >= intervalo && letras[j - intervalo] > letraTemporaria) {
                    letras[j] = letras[j - intervalo];
                    j -= intervalo;
                }
                letras[j] = letraTemporaria;
            }
            intervalo /= 2;
            System.out.println(letras);
        }
        return letras;
    }
}


