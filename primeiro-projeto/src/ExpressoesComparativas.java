public class ExpressoesComparativas {
    public static void main(String[] args) {
       int pao = 10;
       int acucar = 20;
                        /* Expressões comparativas no JAVA --> Comparam 2 variáveis para saber se são iguais
                        ou diferentes.
                            Pode se aplicar a qualquer coisa: double, String, Long.
                         */

        System.out.println(pao == acucar); // Operador == --> Igual a
        System.out.println(pao != acucar); // Operador != --> Diferente de
        System.out.println(pao > acucar);  // Operador >  --> Maior que
        System.out.println(pao < acucar);  // Operador <  --> Menor que
        System.out.println(pao >= acucar); // Operador >=  --> Maior ou igual a
        System.out.println(pao <= acucar); // Operador <=  --> Menor ou igual a
    }
}