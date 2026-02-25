package academy.devdojo.estruturascondicionais.ifselse;

import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = sc.nextInt();

        if ((numero % 2) == 0) {
            System.out.println("Esse é um número par");
        } else {
            System.out.println("Esse é um número ímpar");
        }
        sc.close();
    }
}
