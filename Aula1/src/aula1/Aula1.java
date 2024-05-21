package aula1;

import java.util.Scanner;

public class Aula1 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("DIGITE A QUANTIDADE DE GOLS");
        int qg = leia.nextInt();

        System.out.println("DIGITE A QUANTIDADE DE PASSES CERTOS");
        int gc = leia.nextInt();

        System.out.println("DIGITE A QUANTIDADE DE PASSSES ERRADOS");
        int ge = leia.nextInt();

        int pontos = (qg * 50) + (gc * 10) + (ge * -5);

        if (pontos < 50) {
            System.out.println("PESSIMA PARTIDA");

        } else if (pontos >= 50 && pontos < 100) {
            System.out.println("PARTIDA RUIM");

        } else if (pontos >= 100 && pontos < 150) {
            System.out.println("FEZ O BASICO");
        } else if (pontos >= 150 && pontos < 200) {
            System.out.println("JOGOU BEM");
        } else if (pontos >= 200) {
            System.out.println("JOGOU DEMAIS");

        }
    }
}
