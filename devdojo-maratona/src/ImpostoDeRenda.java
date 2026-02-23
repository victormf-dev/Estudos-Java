import java.util.Scanner;

public class ImpostoDeRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu Salário: ");
        double salario = sc.nextDouble();
        double porcentagemIrAplicada = 0;
        if (salario <= 1903.98) {
            System.out.println("Você está isento do Imposto de Renda");
        } else if (salario > 1903.98 && salario <= 2826.65) {
            porcentagemIrAplicada = salario * 0.075;
            System.out.println("Você pagará 7.5% de Imposto de Renda, no valor de R$ " + porcentagemIrAplicada);
        } else if (salario > 2826.65 && salario <= 3751.05) {
            porcentagemIrAplicada = salario * 0.15;
            System.out.println("Você pagará 15% de Imposto de Renda, no valor de R$ " + porcentagemIrAplicada);
        } else if (salario > 3751.05 && salario <= 4664.68) {
            porcentagemIrAplicada = salario * 0.225;
            System.out.println("Você pagará 22.5% de Imposto de Renda, no valor de R$ " + porcentagemIrAplicada);
        } else {
            porcentagemIrAplicada = salario * 0.275;
            System.out.println("Você pagará 27.5% de Imposto de Renda, no valor de R$ " + porcentagemIrAplicada);
        }
        sc.close();
    }
}
