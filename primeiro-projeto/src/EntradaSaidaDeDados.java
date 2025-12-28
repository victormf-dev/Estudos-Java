import java.util.Scanner;

public class EntradaSaidaDeDados {
    public static void main(String[] args) {

        // Entrada e Saída de Dados

            // Saída de dados
             // System.out.println("") --> Faz a impressão e pula uma linha --> MAIS UTILIZADO
            // System.out.printf("") --> Faz a impressão formatada
           // System.out.print("") --> Faz a impressão na mesma linha

//            System.out.print("Olá, eu faço a impressão na mesma linha. ");
//            System.out.println("Olá, eu faço a impressão e pulo uma linha. ");
//            System.out.printf("Olá, eu faço a impressão formatado. ");

            // Entrada de Dados
                // Para ler dados do teclado usa-se a Classe Scanner
                // Para usar a Classe Scanner também é necessário atribuir nome assim como se atribui para as variáveis
                    // geralmente usa-se o mesmo nome da classe --> no caso Scanner seria Scanner
                // Depois disso --> cria-se um objeto --> new Scanner(System.in) --> entrada de dados

            Scanner scanner = new Scanner(System.in); // Objeto scanner
                // Exemplificação de como atribuir o objeto na classe scanner

            System.out.println("Olá, Digite o seu nome: ");
            String nome = scanner.nextLine();
            System.out.println(nome);

            System.out.println("Qual a sua idade? ");
            int idade = scanner.nextInt();
            System.out.println(idade + " anos.");

            System.out.println("Atualmente está aprendendo JAVA?");
            boolean aprendendoJava = scanner.nextBoolean();
            System.out.println(aprendendoJava);



    }
}
