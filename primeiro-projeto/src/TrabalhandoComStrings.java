public class TrabalhandoComStrings {
    public static void main(String[] args){

        String nome = "Victor";
        String sobrenome = " Marques";

        int tamanhoStringNome = nome.length();
        int tamanhoStrigSobrenome = sobrenome.length();
        String nomeCompleto = nome + sobrenome;
        int tamanhoNome = nome.length() + sobrenome.length();

        boolean saoIguais = nome.equals(sobrenome);

        System.out.println("Olá "+ nome +","+ " seu nome tem "+ tamanhoStringNome + " caracteres ");
        System.out.println("Seu sobrenome é: "+ sobrenome);
        System.out.println("Nome completo: "+ nomeCompleto);
        System.out.println("Quantidade de caracteres do seu nome completo "+ tamanhoNome);

        System.out.println("Os nomes são iguais: "+ saoIguais);


    }
}
