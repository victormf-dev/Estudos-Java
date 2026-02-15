public class DoWhile {
    public static void main(String[] args) {
         /*
      Estruturas Repetitivas --> faz com que o bloco de código seja executado várias vezes, enquanto uma condição
        específica for verdadeira.

       Principais estruturas repetitivas em JAVA: while, for e do while

       ESTRUTURA DO WHILE --> Executa um bloco de código repetidamente, enquanto a condição especificada for verdadeira.
            EXECUTA A AÇÃO PRIMEIRO E VERIFICA A CONDIÇÃO NO FINAL --> ENTÃO EXECUTA A AÇÃO ATÉ QUE A CONDIÇÃO
                SEJA ATINGIDA E DAI PARA A EXECUÇÃO.  --> bem  pouco utilizado

               do while {

                } while (condicao);
       */
        int contador = 0;
        do {
            System.out.println( "Contador do while " + contador);
            contador ++;
        } while (contador<5);

    }
}
