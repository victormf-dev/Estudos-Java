public class EstruturaFor {
    public static void main(String[] args) {
        /*
        A Estrutura for é usada para repetir um bloco de código um número específico de vezes.
            Semelhante as estruturas while e do while, onde temos o for --> inicialização ; condição ; incremento;
                tudo na mesma linha.

            Estrutura
                for (inicializacao ; condicao ; incremento) {
                }
         */
        for (int contador = 0; contador<5; contador++){
            System.out.println("Contador " + contador);
        }
    }
}
