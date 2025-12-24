//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Tipos Primitivos e Variáveis (int, long, double, char e boolean) + String --> Para Caracteres
        // primeiro declara o tipo da variável e depois atribui o nome da variável
        // Exemplo: int (inteiro) --> idade (nome da variável)

        String userName = " Victor "; // usado para caracteres
        String userSurname = "Marques Ferreira "; // usado para caracteres
        int idade = 33; // para número inteiros
        long accountBalance = 1580375L;// para número muito grandes --> tem que colocar o L no final
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