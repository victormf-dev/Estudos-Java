import java.util.Map;
import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        /*
        HASHMAP -->
            ESTRUTURA -> Chave, Valor
            TREE MAP
            Também trabalha com chave, valor --> key, value
            Mas mantém a ordem estabelecida, diferente do HashMap que não mantém a ordem

         */
        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Alice", 9.8);
        notasAlunos.put("Maria", 9.9);
        notasAlunos.put("Matheus", 9.5);

        // iterar com for --> keyset (chave --> no caso aqui Chave é o nome e o valor a nota).
        for (String nome : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nome);
            System.out.println(nome + ": " + nota);
        }

        //iterar com for --> tanto pelo key quanto pelo value (chave --> nome ; value --> nota)
        for (Map.Entry<String, Double> nota : notasAlunos.entrySet()) {
            String nome = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nome + ": " + valorNota);
        }
        System.out.println("Primeira Chave: " + notasAlunos.firstKey());
        System.out.println("Última Chave: " + notasAlunos.lastKey());

    }
}
