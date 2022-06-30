#include <stdio.h>

void main(){
    int anos, meses, dias, res;

    printf("Qual a sua idade?\n");
    printf("Anos: ");
    scanf("%d", &anos);
    printf("\nMeses: ");
    scanf("%d", &meses);
    printf("\nDias: ");
    scanf("%d", &dias);

    res = (anos * 365) + (meses * 30) + dias;
    printf("\n\n%d dias.\n\n", res);
}