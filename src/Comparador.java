//Passo a passo
//Escreva um programa que solicite ao usuário dois números inteiros, usando o Scanner para a entrada de dados.
//Compare os dois números para verificar qual é o maior.
//Imprima no console o maior número, seguindo exatamente o formato: "O maior número é: {numero}." — por exemplo: "O maior número é: 7."
//Caso os dois números sejam iguais, imprima a mensagem: "Os números são iguais!"
//Utilize as estruturas if, else if e else para tratar as condições.
//Teste o programa com diferentes combinações de valores (número 1 maior, número 2 maior, números iguais) para garantir que todos os cenários funcionam.
//Suba o código para um repositório no GitHub e compartilhe o link no campo de entrega.
//Requisitos obrigatórios


import java.util.Scanner;

public class Comparador {
    static void main() {
        Scanner scanner = new Scanner(System.in);
            System.out.println("Digite um número:");
            int n1 = scanner.nextInt();
            System.out.println("Digite outro número: ");
            int n2 = scanner.nextInt();
        scanner.close();

        if(n1 == n2){
            System.out.println("Os número são iguais!");
        }else if(n1 > n2){
            System.out.println("O maior numero é: %d".formatted(n1));
        }else{
            System.out.println("O maior número é: %d".formatted(n2));
        }
    }
}