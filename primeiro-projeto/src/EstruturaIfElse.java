import java.util.Scanner;

public class EstruturaIfElse {
    public static void main(String[] args) {
     /* A Estrutura condicional If, Else e Else If
        If --> Se a condição for verdadeira --> Executa alguma coisa
        Else --> Se a condição for falsa --> Executa essa "outra coisa"
        Else If --> É a validação o teste de uma segunda condição após o If --> Se o 1º if for falso, testa o
                else if --> Se ele for verdadeiro executa a condição dele.
           Se o else if for falso também, vai para o else --> Executa-se a condição do else (que é o fim da condição)
        If --> Se a CONDIÇÃO 1 for verdadeira --> Executa e sai da estrutura.
   Else If --> (Opcional - CONDIÇÃO 2, pode ter vários Else If - que são as condições em cascata) --> Se o anterior falhou, testa este.
   Se for verdade, executa e sai. --> Se essa condição falhar --> executa a CONDIÇÃO 3 e etc... em cascata.
   Else --> (Opcional) --> Se TODAS as condições acima falharam --> Executa isso como último recurso.
            ESTRUTURA DO CÓDIGO CONDICIONAL --> IF ELSE
               if (condição1) {
                se a condição for verdadeira --> executa --> se não
                }
                else if (condição2) {
                se a condição for verdadeira --> executa --> se não
                }
                else {
                se nenhuma das anteriores for verdadeira --> executa essa
                }
       */
        int idade = 19;

        if (idade >= 18) {
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

        boolean estaChovendo = true;
        if (!estaChovendo) {
            System.out.println("Vamos sai pra passear");
        }
        else {
            System.out.println("Vamos ficar em casa");
        }

        boolean temDinheiro = false;
        boolean temCartao = true;
        if (temDinheiro && temCartao){
            System.out.println("Vamos pedir um ifood e um zé delivery");
        }
        else if (temDinheiro || temCartao){
            System.out.println("Vamos pedir só um ifood");
        }
        else {
            System.out.println("É melhor não pedir nada. Estamos sem grana.");
        }

        /* Exercício proposto pelo Gemini -->
        Desafio: A Lógica do Imposto de Renda (Simplificada)
        Tente escrever um código que defina uma taxa de imposto baseada no salário (variável double salario).
        As regras:
        Se ganhar até 3000: Isento (Taxa 0).
        Se ganhar até 5000 (e for maior que 3000): Taxa de 15%.
        Se ganhar acima de 5000: Taxa de 27.5%.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o seu salário mensal?");
                double salarioMensal = scanner.nextDouble();

                // Vamos guardar o valor do imposto aqui para calcular depois
                double valorDoImposto = 0;
                double porcentagem = 0;

                System.out.println("Analisando seu salário de R$ " + salarioMensal + "...");

                // 1. LÓGICA DE DECISÃO (Definindo a alíquota)
                if (salarioMensal < 3000) {
                    System.out.println("Você está ISENTO. Não paga nada ao Leão.");
                }
                else if (salarioMensal >= 3000 && salarioMensal < 5000) {
                    // Regra: Entre 3mil e 5mil
                    porcentagem = 15; // Apenas visual
                    valorDoImposto = salarioMensal * 0.15; // 15% na matemática

                    System.out.println("Sua alíquota é de 15%.");
                    System.out.println("Valor a pagar: R$ " + valorDoImposto);
                }
                else {
                    // Regra: Acima de 5mil (O Residual/Else)
                    porcentagem = 27.5;
                    valorDoImposto = salarioMensal * 0.275; // 27.5% na matemática

                    System.out.println("Sua alíquota é de 27.5%.");
                    System.out.println("Valor a pagar: R$ " + valorDoImposto);
                }





    }
}


