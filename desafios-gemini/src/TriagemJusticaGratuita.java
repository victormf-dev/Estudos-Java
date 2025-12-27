import java.util.Scanner;

public class TriagemJusticaGratuita {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        double faixaDeCorte = 2800.00;

        System.out.println(" Digite o salário mensal do cliente: ");

        double salarioMensal = read.nextDouble();

        if (salarioMensal <= faixaDeCorte) {
            System.out.println("Como o salário mensal do cliente é de R$ " + salarioMensal + ", ou seja, abaixo de " + faixaDeCorte +
                    ", o perfil do Cliente está APROVADO para Justiça Gratuita. O Cliente não precisa pagar custas");
        } else {
            System.out.println("Como o salário mensal do cliente é de R$ " + salarioMensal + ", ou seja, acima de " + faixaDeCorte +
                    ", o perfil do Cliente está Reprovado para Justiça Gratuita. O Cliente deve pagar custas");

        }
    }
}
