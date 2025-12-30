public class ExpressoesComparativas {
    public static void main(String[] args) {
       int pao = 10;
       int acucar = 20;
        /* Expressões comparativas no JAVA --> Comparam 2 variáveis para saber se são iguais
                 ou diferentes.
           Pode se aplicar a qualquer coisa: double, String, Long.
        */

        System.out.println(pao == acucar); // Operador == --> Igual a  --> Só um sinal de igual significa atribuição.
        System.out.println(pao != acucar); // Operador != --> Diferente de
        System.out.println(pao > acucar);  // Operador >  --> Maior que
        System.out.println(pao < acucar);  // Operador <  --> Menor que
        System.out.println(pao >= acucar); // Operador >=  --> Maior ou igual a
        System.out.println(pao <= acucar); // Operador <=  --> Menor ou igual a

    }
}
/* COMENTÁRIO ADICIONAL:

    Imagine dois contratos impressos com o mesmo texto.
    Comparação de Conteúdo (.equals): O texto é idêntico? Sim.
    Comparação de Referência (==): É a mesma folha de papel física? Não.

    No código:
    Java
    String texto1 = "Advogado";
    String texto2 = new String("Advogado");
      O ERRO COMUM:
        System.out.println(texto1 == texto2);
        Resultado: FALSE (Falso)!!
    O Java diz: "São dois objetos diferentes na memória, apesar de terem o mesmo texto".
    O JEITO CERTO (Para Strings e Objetos):
        System.out.println(texto1.equals(texto2));
        Resultado: TRUE (Verdadeiro).
    Resumo para seu caderno:
    Para Números (int, double, float): Use ==, !=, etc.

    Para Textos (String) e Objetos complexos: Use .equals().
    Tirando esse detalhe (que é avançado e pega todo mundo), sua lógica de comentar sobre Atribuição (=) vs Comparação (==) está perfeita.

 */