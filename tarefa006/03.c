#include <stdio.h>

void main(){
    float saldo;

    printf("Digite o seu saldo: ");
    scanf("%f", &saldo);
    
    printf("\nSaldo com reajuste de 15%: %.2f\n", (saldo + (saldo * 0.15)));
}