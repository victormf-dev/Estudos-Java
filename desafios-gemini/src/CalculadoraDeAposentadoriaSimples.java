import java.util.Scanner;

public class CalculadoraDeAposentadoriaSimples {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int requisitoEtario = 65;
        int requisitoTempoContribuicao = 30;

        System.out.println("Qual o seu nome? ");
        String nomeDoCliente = leitor.nextLine();

        System.out.println("Qual a sua idade? ");
        int idadeCliente = leitor.nextInt();

        System.out.println("Quanto tempo de contribuição você tem? ");
        int tempoDeContribuicao = leitor.nextInt();

        if (idadeCliente >= requisitoEtario && tempoDeContribuicao >= requisitoTempoContribuicao) {
            System.out.println(nomeDoCliente + ", você cumpre as regras da Previdência Social e já pode requerer " +
                    " sua aposentadoria.");
        }
        else {
            System.out.println(nomeDoCliente + ", infelizmente você não cumpre as regras da Previdência Social e ainda " +
                    " não pode requerer sua aposentadoria");

        }

    }
}
