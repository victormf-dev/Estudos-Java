public class Main {
    public static void main(String[] args) {

        /* System.out.println --> imprime coisas na tela

        Variáveis - caixa onde guarda valores --> guarda a informação até receber o destino final
             Para nomear as variáveis dar nomes fáceis --> Ex: nome exato do que a variável guarda
             Usar sempre pra nomear a variável o padrão camelCase --> Ex: salarioMensal / calculoAcaoTrabalhista
             Primeiro declara o tipo da variável e depois atribui o nome da variável
             Exemplo: int (inteiro) --> idade (nome da variável)
             O símbolo '' = ''  em linguagem de programação significa atribuir - atribuição

         Tipos Primitivos (tipos mais básicos):
             Inteiros (números): byte, short, int e long
             Ponto Flutuantes (números/casas depois da vírgula): float, double
             Caractere: char (caractere unicode) --> Só um --> Ex: F (feminino) / M (masculino)
             No char precisa usar aspas simples pra declarar.
             Booleano (boolean): Representa verdadeiro ou falso --> True or False
             Tipos Primitivos mais usados: (int, long, double, char e boolean) + String --> Para Caracteres
        */
        String userName = " Victor "; // usado para caracteres
        String userSurname = "Marques Ferreira "; // usado para caracteres
        int idade = 33; // para número inteiros
        long accountBalance = 1580375855L;// para número muito grandes --> tem que colocar o L no final
        double processPayment = 37500.25; // para números com pontos flutuantes --> número depois da vírgula
        char gender = 'M'; // para declarar caractere único - unicode --> M de masculino
        boolean learningJava = true; // para declarar verdadeiro ou falso

        System.out.println("Identification Data:");
        System.out.println("Full Name: " + userName + userSurname);
        System.out.println("Age: " + idade + " years old");
        System.out.println("Account Balance: " + "R$ "+ accountBalance + " reais");
        System.out.println("Payment for IR Law Suit: " + " R$ " + processPayment + " reais");
        System.out.println("Gender: " + gender);
        System.out.println("Learning JAVA: "+ learningJava);

    }
}