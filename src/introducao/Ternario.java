package introducao;

public class Ternario {
    public static void main(String[] args) {
        double saldo = 2000;
        String doarParaVaquinha = "Vou doar 500 reais para a vaquinha.";
        String naoConsigoDoar = "Estou sem condições de doar no momento! :(";
        String resultado = saldo >= 2000 ? doarParaVaquinha : naoConsigoDoar;
        System.out.println(resultado);
    }
}