package introducao;

public class Operadores {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int resto = 20 % 2;

        // < menor <= menor igual
        // > maior >= maior igual
        // == sinal de igualdade // != sinal de diferente

        boolean dezDifeDez = 10 != 23;
        System.out.println(dezDifeDez);
        System.out.println(resto);
        System.out.println(num2 - num1);
        System.out.println(num2 + num1);
        System.out.println(num2 / num1);
        System.out.println(num2 * num1);
        System.out.println(num2 + num1 + " String no final da operação com operador +");
        System.out.println("String no começo da operação com operador + no restante, concatena " + num2 + num1);

        // && (and) || (or) ! (not)

        int idade = 35;
        float salario = 4900.69F;

        // uso do && (and)

        if (idade >= 30 && salario >= 4500) {
            System.out.println("Salário deste funcionário está dentro da lei.");
        } else {
            System.out.println("Funcionário irregular de acordo com a lei.");
        }

        // uso do || (or)

        double valorContaCorrente = 300;
        double valorPoupanca = 3200;
        String compra = "Nintendo Switch OLED";
        if (valorContaCorrente > 1500 || valorPoupanca > 4000) {
            System.out.println("Você pode comprar o " + compra);
        } else {
            System.out.println("Você não pode comprar nada este mês.");
        }


    }
}
