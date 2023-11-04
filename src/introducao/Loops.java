package introducao;

public class Loops {
    public static void main(String[] args) {

        int numero = 0;

//        while (numero <= 10) {
//            System.out.println(numero);
//            numero++;
//        }
//          No caso do do-while, mesmo que a condição seja falsa, irá ser executado pelo menos uma vez.
        do {
            System.out.println(++numero);
        } while (numero < 0);


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }


}
