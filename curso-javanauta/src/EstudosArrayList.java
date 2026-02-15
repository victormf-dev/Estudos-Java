import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;

public class EstudosArrayList {
    public static void main(String[] args) {
        /* ArrayList é também uma classe de JAVA --> Por isso não pode criar o nome como ArrayList direto e ficou
            EstudosArrayList

        Coleções são estruturas de dados que permitem armazenar (mais de um elemento), buscar e manipular grupos de
            objetos de forma mais flexível do que arrays.
          Listas -> uma lista em JAVA é uma coleção ordenada que permite elementos duplicados.
          A interface list estende a interface Collection e fornece métodos adicionais para inserir,
            acessar, remover e iterar elementos de maneira mais controlada.
            Tipo mais comum de Lista
                ArrayList: Implementação de lista baseada em arrays dinâmicos.
                Funcionalidade:

          Principais diferenças entre Arrays e Coleções (Collections)

          Array -> - Tamanho definido no momento da criação e não pode ser alterado.
                   - Podem armazenar tipos primitivos (int, char, double, etc.) e objetos também.

          Coleções -> - Tamanho das coleções pode crescer ou diminuir (dinâmicos)
                      - Coleções armazenam apenas objetos.
                      - Tipos primitivos devem ser usados com wrappers --> Interger para int

            Pra criar um ArrayList --> Declara List<> --> dentro dos sinais de maio e menor só pode ir objeto
         */
        // ALt+Enter --> Importa a Classe -> No caso aqui ==> import java.util.List;
        // AS IMPORTAÇÕES SÃO ANTES DO METODO MAIN

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em Pó");
        listaDeCompras.add("Macarrão");

        listaDeCompras.add(1, "Banana");
        for (String item : listaDeCompras) {
            System.out.println(item);
        }
        String item = listaDeCompras.get(2);
        System.out.println("Na posição 2, eu tenho: " + item);
        listaDeCompras.remove("Sabão em Pó");

        for(String item2 :listaDeCompras){
            System.out.println(item2);
        }

        boolean estaVazia = listaDeCompras.isEmpty();
        int tamanhoLista = listaDeCompras.size();
        boolean contemElemento = listaDeCompras.contains("Arroz");

        System.out.println("A lista está vazia? " + estaVazia + "." + " Qual o tamanho da lista? " + tamanhoLista
        + "." + " A Lista contém Arroz? " + contemElemento);

//        listaDeCompras.clear();
//        System.out.println("A lista de compra está vazia? " + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produto -> System.out.println(produto));


    }

}

