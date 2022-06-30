#include <stdio.h>

void main(){
    int num;

    printf("Digite um numero inteiro: ");
    scanf("%d", &num);

    printf("\nO antecessor e o sucessor de %d e: %d e %d\n", num, (num-1), (num+1));
}