#include <stdio.h>

void main(){
    float smin, susu;

    printf("Valor do salario minimo: ");
    scanf("%f", &smin);
    printf("Valor do seu salario: ");
    scanf("%f", &susu);

    printf("\n\nVoce ganha %.1f salarios minimos.\n", (susu/smin));
}