public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        double salario = 4200;
        double resultado = 0;
        String porcentagem = "";
        if (salario > 4500) {
            resultado = salario * 0.3;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.1;
            porcentagem = "10%";
        }
        System.out.println("O valor de "+ porcentagem + " é " + resultado);


    }
}
