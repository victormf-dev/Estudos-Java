import java.util.HashMap;
import java.util.Map;

public class EstudoHashMap {
    public static void main(String[] args) {
        /* HasMap --> É utilizada para armazenar pares de chave-valor.
            Faz parte do pacote do java.util.
            HashMaps também é uma coleção, mas não é lista simples
            Chave-Valor: Um HashMap armazena dados em pares de chave-valor.
            Cada chave é única e está associada a um valor.
            Ex: Notas de Alunos de uma escola:
            Nome do aluno --> Notas
            "Victor" , 10;
            HashMap pode ter <String, Interger
                              String, String
                              Interger, Interger>
            HASHMAP -->
            ESTRUTURA -> Chave, Valor
            Mas não mantém ordem dos elementos, pois está usando a tabela de Hash para armazenar na memória
            em tempo de execução esses valores --> Quando reinicia a execução, a ordem dos elementos se altera.
            Na primeira execução 1ª era Alice. Depois na nova execução 1º já pode ser o Matheus.

            DIFERENTE DO TREE MAP
            Também trabalha com chave, valor --> key, value
            Mas mantém a ordem estabelecida

         */
        HashMap <String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Alice", 9.5);
        notasAlunos.put("Matheus" , 8.0);
        notasAlunos.put("Maria", 9.9);

        // iterar com for --> keyset (chave --> no caso aqui Chave é o nome e o valor a nota)
        for(String nome : notasAlunos.keySet()){
            double nota = notasAlunos.get(nome);
            System.out.println(nome + ": " + nota);
        }

        //iterar com for --> tanto pelo key quanto pelo value (chave --> nome ; value --> nota)
        for(Map.Entry<String, Double> nota : notasAlunos.entrySet()){
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + ": " + valorNota);
        }

        double nota = notasAlunos.get("Alice");
        System.out.println("A nota da Alice é: " + nota);

        int tamanhoDoHashMap = notasAlunos.size();

        notasAlunos.remove("Maria");


    }
}
