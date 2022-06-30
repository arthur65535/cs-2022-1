#include <stdio.h>

void main(){
    float ipi, valor1, valor2;
    int cod1, cod2, qtd1, qtd2;

    printf("Digite a porcentagem de IPI: ");
    scanf("%f", &ipi);
    printf("Digite o código da peça 1: ");
    scanf("%d", &cod1);
    printf("Digite o valor da peça 1: ");
    scanf("%f", &valor1);
    printf("Digite a quantidade da peça 1: ");
    scanf("%d", &qtd1);
    printf("Digite o código da peça 2: ");
    scanf("%d", &cod2);
    printf("Digite o valor da peça 2: ");
    scanf("%f", &valor2);
    printf("Digite a quantidade da peça 2: ");
    scanf("%d", &qtd2);

    printf("Valor total a ser pago: %.2f\n", ((valor1*qtd1 + valor2*qtd2) * (ipi/100 + 1)));
}