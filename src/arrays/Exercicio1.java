package arrays;

/*
Que o programa implemente as seguintes funções:

A) totalPares: a função recebe como parâmetro um array de inteiros e retorna um
número inteiro indicando o total de números pares existentes no array.

B) maiorValor: a função recebe como parâmetro um array de inteiros e retorna o maior valor
no array.

C) totalIguais: a função recebe como parâmetro dois arrays de inteiro e retorna o total de números
iguais existentes em ambos os arrays.

Em seguida, crie a função principal do programa para testar as funções criadas em arrays definidos
 estaticamente ou informados pelo usuário.

 */

public class Exercicio1 {
    public static String totalPares(int[] arrayInt) {
        int totPares = 0;
        for (int numero : arrayInt) {
            if (numero % 2 == 0) {
                totPares += 1;
            }
        }
        return "Solução A) Total de números Pares: " + totPares;
    }

    public static String maiorValor(int[] arrayInt){
        int maior = arrayInt[0];
        for(int numero : arrayInt){
            if(numero > maior){
                maior = numero;
            }
        }
        return "Solução B) O maior número é: " + maior;
    }

    public static String totaisIguais(int[] arrayInt, int[] arrayInt2){
        int totalIguais = 0;
        for(int numero : arrayInt){
            for(int indice = 0; indice < arrayInt2.length; indice++){
                if(numero == arrayInt2[indice]){
                    totalIguais += 1;
                }
            }
        }
        return "Solução C) Total de números iguais: " + totalIguais;
    }

    public static void main(String[] args){
        int[] arrayNumerosInteiros = {4, 3, 33, 2, 8, 9, 11, 1};
        int[] arrayNumerosInteiros2 = {1, 5, 33, 3, 2, 6, 11, 9};

        System.out.println(totalPares(arrayNumerosInteiros));
        System.out.println(maiorValor(arrayNumerosInteiros));
        System.out.println(totaisIguais(arrayNumerosInteiros, arrayNumerosInteiros2));
    }
}
