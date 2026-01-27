import java.util.Scanner;

public class TriagemFinanciamento {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== SISTEMA DE TRIAGEM DE FINANCIAMENTO ===");

        System.out.println("Qual o seu nome? ");
        String nomeCliente = sc.nextLine();

        System.out.println("Qual o valor do seu salário?");
        double salarioCliente = sc.nextDouble();

        System.out.println("Qual o valor do crédito para o financiamento?");
        double valorFinanciamento = sc.nextDouble();

        System.out.println("Qual o número de parcelas?");
        int numeroDeParcelas = sc.nextInt();

        double limiteMaximoComprometimentoRenda = (salarioCliente * 0.3);
        double valorDaParcela = (valorFinanciamento/numeroDeParcelas);
        double faixaDeCorteClienteVip = 10000;


        if (valorDaParcela > limiteMaximoComprometimentoRenda) {
            System.out.println("Infelizmente, " + nomeCliente + " seu crédito não foi aprovado.");
        } else {
            System.out.printf("Parabéns, %s seu crédito foi aprovado! O valor da parcela será R$: %.2f%n", nomeCliente, valorDaParcela);
        }

        String statusCliente = (salarioCliente > faixaDeCorteClienteVip) ? "Cliente VIP" : "Cliente Comum";
        System.out.println(statusCliente);





    }
}
