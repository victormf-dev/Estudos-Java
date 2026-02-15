public class Array {
    public static void main(String[] args) {
     /* Arrays --> são estruturas de dados que armazenam uma coleção de ELEMENTOS DO MESMO TIPO em uma sequência
        ordenada. ARRAY -> VARIÁVEL QUE CONTÉM MAIS DE UM ELEMENTO DO MESMO TIPO.
        Arrays são úteis para armazenar um número fixo de elementos. O tamanho de um array é definido no momento de sua
        criação e não pode ser alterado. TODOS OS ELEMENTOS DEVEM SER DO MESMO TIPO.
        Os elementos do array sempre começam na posção 0 --> Logo, se um array tem 5 elementos, eles vão de 0 a 4;
        Formas de inicializar  / O QUE DEFINE O ARRAY SÃO OS COLCHETES
        Declara o tipo --> coloca [] (que define o array) --> depois atibui
        Ex: int[] numeros = {1, 2, 3, 4, 5};
            String[] frutas = {"Maçã", "Banana", "Laranja"};
                ou
            int[] numeros = new int[5]; (TIPO -> int / [] -> array / nome -> numeros = new -> define que a atribuição
                                            será posterior (inicializa sem declarar ainda os elementos)
                                             / [] -> array e dentro dele [5] -> tamanho 5;)
            int[] numeros = new int[5]
            numeros = [0] = 1;
            numeros = [1] = 2;
            numeros = [2] = 3;
            numeros = [3] = 4;
            numeros = [4] = 5;
      */
        //Declaração de Array
        int[] numeros = {10, 20, 50, 30,1};

        String[] frutas;
        frutas = new String[]{"Maçã", "Morango", "Abacaxi", "Uva"};
        // inicializar
        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 200.00;
        salarios[0] = 150.00;
        salarios[2] = 250.00;
        salarios[4] = 100.00;
        // iteração sobre o array
        for(int posicao = 0; posicao < salarios.length; posicao++){
            System.out.println(salarios[posicao]);
        }
        // for each --> passa por cada um dos elementos do array e vai imprimindo enquanto tiver valor
        // declara o for (tipo da vaiável -> novo nome da variável : variável do array)
        for(double salario : salarios){
            System.out.println(salario);
        }

        //Pra alterar o valor de uma posição do array --> declara o nome da variável, a posição e faz nova atribuição

        salarios[2] = 350.00;
        System.out.println(salarios[2]);


//        System.out.println(numeros[2]);
//        System.out.println(frutas[2]);

    }
}
