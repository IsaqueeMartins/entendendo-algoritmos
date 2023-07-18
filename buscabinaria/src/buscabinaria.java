import java.util.Arrays;

public class buscabinaria {
    public static int buscaBinaria(int[] array, int chave) {
        int baixo = 0;
        int alto = array.length - 1;

        while (baixo <= alto) {
            int meio = (baixo + alto) / 2;
            int valorMeio = array[meio];

            if (valorMeio == chave) {
                return meio;
            } else if (valorMeio < chave) {
                baixo = meio + 1;
            } else {
                alto = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] lista = {39, 7, 17, 37, 64, 52, 55, 32, 13, 74};

        int chave = 74;

        int indice = buscaBinaria(lista, chave);

        if (indice >= 0) {
            System.out.println("Elemento encontrado no indice " + indice);
        } else {
            System.out.println("Elemento nao encontrado");
        }
    }
}