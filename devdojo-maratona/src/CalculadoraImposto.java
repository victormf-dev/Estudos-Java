public class CalculadoraImposto {
    public static void main(String[] args) {
        double salario = 2500.00;
        double porcentagem = 25;
        double porcentagemImpostoDoSalario = salario * (porcentagem / 100);
        System.out.println();
        System.out.println("O Valor do imposto é " + porcentagemImpostoDoSalario);

    }
}
