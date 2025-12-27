public class OperadoresAritimeticos {
    public static void main(String[] args) {

        // REGRA DE NOME DE CLASSE: NÃO TEM CAMEL CASE - NÃO TEM ACENTO - NÃO TEM ESPAÇO
        // Operadores Aritméticos
            // Adição (+)
            // Subrtração (-)
            // Multiplicação (*)
            // Divisão (/)
            // Módulo (%) --> Retorna o resto da divisão --> Ex: 5 dividido por 2, daria 2 como resultado principal
                // e sobraria o 1 para ser dividido por 2 depois --> o módulo retorna esse 1

        // Precedência de Operadores --> Como na matemática - determina quais as operações serão executadas primeiro
            // 1º Resolve o parêntesis
            // 2º Resolve a exponenciação
            // 3º Resolve multiplicação e divisão
            // 4º Resolve adição e subtração

        System.out.println("=== Gastos no Mercado ===");

        double pao = 10.50;
        double queijo = 7.00;
        double acucar = 5.30;

        double desconto10porcento = 0.10;
        int totalDiasMes = 30;
        int qtdPessoas = 2;

        double valorTotal = pao + queijo + acucar;
        double valorTotalComDesconto = valorTotal - (valorTotal * desconto10porcento);
        double valorTotalDividido = valorTotalComDesconto / qtdPessoas;
        double valorGastoMensal = (valorTotalDividido * totalDiasMes);

        System.out.println("O Valor total da compra é R$ " + valorGastoMensal + " por pessoa");


    }
}