public class TrabalhandoComStrings {
    public static void main(String[] args){

        /*Trabalhando com Strings
            String em JAVA é usada para armazenar e manipular texto.

         Concatenando Strings
             Usa o operador + para cogitncatenar (juntar) strings
             Ex: String saudação = "Olá, + nome + "!";
        */
       String nome = "Victor";
       String sobrenome = "Marques";

       int tamanhoStringNome = nome.length();
       int tamanhoStringSobrenome = sobrenome.length();
       int somaTamanhoStringsNomes = nome.length() + sobrenome.length();
       boolean nomesSaoIguais = nome.equals(sobrenome);

        System.out.println("Olá, " + nome + sobrenome);
        System.out.println(nome + " seu nome tem " + tamanhoStringNome + " caracteres");
        System.out.println(nome + " seu sobrenome tem " + tamanhoStringSobrenome + " caracteres");
        System.out.println(nome + " seu nome completo tem " + somaTamanhoStringsNomes + " caracteres");
        System.out.println("Seu nome em letras maiúsculas: " + nome.toUpperCase());
        System.out.println("Seu nome em letras minúsculas: " + nome.toLowerCase());
        System.out.println("Seu sobrenome em letras maiúsculas: " + sobrenome.toUpperCase());
        System.out.println("Seu sobrenome em letras minúsculas: " + sobrenome.toLowerCase());
        System.out.println("O nome e o sobrenome são iguais: " + nomesSaoIguais);


    }
}
