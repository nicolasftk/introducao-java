package introducao;

public class LoopDeNumeros {
    public static void main(String[] args) {

        int numerosPares = 0;

        while (numerosPares < 100) {
            if (numerosPares % 2 == 0) {
                System.out.println(numerosPares);

            }
            numerosPares++;
        }

        for (int impar = 0; impar <= 1000000; impar++) {
            if (impar % 2 != 0) {
                System.out.println(impar);
            }
        }
    }
}
