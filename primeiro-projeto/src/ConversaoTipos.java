public class ConversaoTipos {
    public static void main(String[] args) {
       /* Casting --> Conversão de Tipos

             Conversão implícita --> Ocorre automáticamente quando convertemos um tipo menor para um tipo maior
                 Ex: int i = 10
                 double d = i

             Conversão Explícita --> Precisa fazer manualmente ao converter um tipo maior para um tipo menor
                 Ex: double d2 = 10.5
                 int i2 = (int) d2   --> Os parêntesis aqui são o casting (conversor de tipo)
              int para String --> String para int

        Exemplos:
       */
        int numero = 10;
        double d = numero;

        double d2 = 10.5;
        int int2 = (int) d2;
        System.out.println(d);
        System.out.println(int2);

        /* Não se pode converter de int para String, pois o int é um tipo primitivo.
      Tem que usar o Integer --> que é encapsulado (o int está dentro dele). Da mesma forma de String para
        */
        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString();
        System.out.println(numeroString);

        String num2String = "2026";
        Integer num2Integer = Integer.parseInt(num2String);
        System.out.println(num2Integer);

        Double numeroDouble = 20.5;
        String numeroDoubleString = numeroDouble.toString();
        System.out.println(numeroDoubleString);


        System.out.println(" Resultado: "+ (3*5));

        }
    }
