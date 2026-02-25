package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class CadastroDeLogin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();

        if (nome.isBlank() || nome.equalsIgnoreCase("admin") || nome.equalsIgnoreCase("administrador")) {
            System.out.println("Usuário Inválido");
        } else {
            System.out.println(nome + " usuário cadastrado com sucesso");
        }

    }
}
