public class While {
    public static void main(String[] args) {
      /*
      Estruturas Repetitivas --> faz com que o bloco de código seja executado várias vezes, enquanto uma condição
        específica for verdadeira.

       Principais estruturas repetitivas em JAVA: while, for e do-while

       ESTRUTURA WHILE --> Executa um bloco de código repetidamente, enquanto a condição especificada for verdadeira.
            VERIFICA A CONDIÇÃO NO INÍCIO
                while (condição) {
                };
       */
        int contador = 0;

        while (contador <= 5) {
            System.out.println ("Contador: " + contador) ;
            contador++;
        }

    }
}
