import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
      /*
      O Switch Case é basicamente a mesma estrutura do If Else. --> ALTERNATIVA A IF ELSE
        --> O If e Else é usado para a verificação de no máximo 3 condições - if/else if/else (boas práticas)
        --> O operador ternário é usado para a verificação de 1 condição somente, if/else simples (boas práticas)
            Estrutura do operador ternário em JAVA --> condição ? valor_se_verdadeiro : valor_se_falso
        --> Já o switch case é usado para a verificação de várias condições, na mesma estrutura --> Se atendida a
            a condição, executa e tem o comando break; --> Se não passa pra próxima. De forma sequênciada.
            Switch Case: É perfeito para VALORES EXATOS (Igualdade).
                Exemplo: O dia da semana é igual a 1? O status do carro é igual a "Vendido"?
                Não funciona bem para: "O salário é maior que 2000?".
                O Switch clássico não lida bem com intervalos (>, <, >=), ele gosta de "chaves exatas".
          ESTRUTURA:
            switch (expressao) {
            case valor1: idade > 3
                executa isso
            break;
            case valor2: idade < 3
                executa isso
             break;
             default;

             }



       */

        int diasDaSemana = 5;

        switch (diasDaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-Feira");
                break;
            case 5:
                System.out.println("Quinta-Feira");
                break;
            case 6:
                System.out.println("Sexta-Feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não corresponde a um dia válido");

        }
        /*
        Imagine que o Switch Case é uma Máquina de Refrigerante.
    1. O que é o case "A"?
       O case "A" é o botão da máquina. Quando você escreve switch (opcao),
        você está dizendo pra máquina: "Olhe para o botão que o usuário apertou".
                case "A" significa: "Se o botão apertado foi o A..."
                case "B" significa: "Se o botão apertado foi o B..."

    2. O que é a setinha -> ?
       A setinha NÃO é necessariamente um sout. Ela significa "ENTÃO O RESULTADO É...".
       Ela serve para ligar o Botão (Case) ao Produto (Resultado), sem você precisar ficar explicando muito.

    Vamos ver na prática (Os dois jeitos)
    Suponha que opcao é o que o usuário escolheu.

    CENÁRIO 1: A setinha executando uma AÇÃO (O "Sout")
    Aqui sim, a setinha vai agir como um gatilho para o sout. "Se for A, imprima isso."

*/
int opcao = 1;

switch (opcao) {
    case 1 -> System.out.println("Você escolheu Água"); // A setinha ACIONA o print
    case 2 -> System.out.println("Você escolheu Refri");
    default -> System.out.println("Opção inválida");
}
/*
Tradução: "Caso seja 1 -> Imprima 'Água'".

CENÁRIO 2: A setinha ENTREGANDO UM VALOR (O que eu te mostrei antes)
Aqui a setinha não imprime nada na tela. Ela só "pega" o valor e joga dentro de uma variável. É como se a máquina jogasse a latinha na sua mão, mas não abrisse ela.
*/

    Scanner sc = new Scanner(System.in);

    int opcaoDeBebida = 0;
        System.out.println("Olá, digite sua opção de bebida desejada: ");
    opcaoDeBebida = sc.nextInt();

// "A variável 'bebida' vai receber o resultado desse switch"
String bebida = switch (opcaoDeBebida) {
    case 1 -> "Você escolheu: Água";  // A setinha ENTREGA a palavra "Água" pra variável 'bebida'
    case 2 -> "Você escolheu: Refri";
    case 3 -> "Você escolheu: Whiskey";
    case 4 -> "Você escolheu: Mate";
    case 5 -> "Você escolheu: Suco";
    default -> "Opção Inválida";
};

// Só aqui embaixo eu imprimo
    System.out.println(bebida);
//Tradução: "Caso seja 1 -> O valor é 'Água' (e guarde isso na variável)"

//Resumo para desenrolar:
//switch (variavel): É o painel de controle.

//case "X": É a verificação. "A variável é igual a X?"

//-> (Setinha): É o comando de ligação direta.
// "Se for X, faça (ou entregue) isso aqui imediatamente e pare." (Ela dispensa o uso da palavra break).

    }
}
