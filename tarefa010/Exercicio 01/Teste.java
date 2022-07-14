import java.util.Random;
public class Teste {
    public static void main(String[] args) {
        //os tres vetores inteiros
        int vet1[], vet2[], vet3[];
        //variaveis temporizadoras
        long temp1ini, temp1fim, temp2ini, temp2fim, temp3ini, temp3fim;
        long rtemp1ini, rtemp1fim, rtemp2ini, rtemp2fim, rtemp3ini, rtemp3fim;
        //instanciacao do rand
        Random rand = new Random();

        //inicializacao dos tres vetores
        vet1 = new int[100];
        vet2 = new int[1000];
        vet3 = new int[10000];

        //preenchimento dos vetores
        for(int i = 0; i < 100; i++){
            vet1[i] = rand.nextInt(10);
        }

        for(int i = 0; i < 1000; i++){
            vet2[i] = rand.nextInt(10);
        }

        for(int i = 0; i < 10000; i++){
            vet3[i] = rand.nextInt(10);
        }

        //medicao da ordenacao dos tres vetores em mergesort iterativo
        IterativoMergeSort ordena = new IterativoMergeSort();
        temp1ini = System.currentTimeMillis();
        ordena.mergeSort(100, vet1);
        temp1fim = System.currentTimeMillis();

        temp2ini = System.currentTimeMillis();
        ordena.mergeSort(1000, vet2);
        temp2fim = System.currentTimeMillis();

        temp3ini = System.currentTimeMillis();
        ordena.mergeSort(10000, vet3);
        temp3fim = System.currentTimeMillis();

        //preenchimento dos vetores de novo
        for(int i = 0; i < 100; i++){
            vet1[i] = rand.nextInt(10);
        }

        for(int i = 0; i < 1000; i++){
            vet2[i] = rand.nextInt(10);
        }

        for(int i = 0; i < 10000; i++){
            vet3[i] = rand.nextInt(10);
        }

        //medicao da ordenacao dos tres vetores em mergesort recursivo
        RecursivoMergeSort ordena2 = new RecursivoMergeSort();
        rtemp1ini = System.currentTimeMillis();
        ordena2.recursivoMergeSort(0, 100, vet1);
        rtemp1fim = System.currentTimeMillis();

        rtemp2ini = System.currentTimeMillis();
        ordena2.recursivoMergeSort(0, 1000, vet2);
        rtemp2fim = System.currentTimeMillis();

        rtemp3ini = System.currentTimeMillis();
        ordena2.recursivoMergeSort(0, 10000, vet3);
        rtemp3fim = System.currentTimeMillis();

        //printf de tudo
        System.out.println("Ordenacao iterativa dos 3 vetores:\n");
        System.out.println("Vetor 1: " + (temp1fim - temp1ini) + " ms\n");
        System.out.println("Vetor 2: " + (temp2fim - temp2ini) + " ms\n");
        System.out.println("Vetor 3: " + (temp3fim - temp3ini) + " ms\n\n");
        System.out.println("Ordenacao recursiva dos 3 vetores:\n");
        System.out.println("Vetor 1: " + (rtemp1fim - rtemp1ini) + " ms\n");
        System.out.println("Vetor 2: " + (rtemp2fim - rtemp2ini) + " ms\n");
        System.out.println("Vetor 3: " + (rtemp3fim - rtemp3ini) + " ms\n\n");
    }
}
