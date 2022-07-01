package Desafio1Modulo2;

import java.util.Random;
import java.util.Scanner;

public class Desafio {

    public static void main(String[] args) {
        String respostasDadas;

        int resultadoFinal = 0;

        do {


            Random random = new Random();
            int numeroSorteado = random.nextInt(10);
            System.out.println("Digite um número para jogar");
            Scanner entrada = new Scanner(System.in);
            respostasDadas = "";

            int numeroInformado = entrada.nextInt();


            if (numeroSorteado == numeroInformado) {
                System.out.println("Você acertou! Ganhou 10");
                resultadoFinal += 10;
            }

            if (numeroSorteado + 1 == numeroInformado) {
                System.out.println("Você ganhou 5 ponto. Quer jogar novamente?");
                resultadoFinal  += 5;

            }

            if (numeroSorteado - 1 == numeroInformado) {
                System.out.println("Você ganhou 5 Ponto Tente outra vez!");
                resultadoFinal += 5;


            }
            System.out.println("Você quer jogar novamente? Sim ou Não ");
            respostasDadas = entrada.next();
        } while (respostasDadas.equalsIgnoreCase("sim"));

        System.out.println("Sua pontuação final é: " + resultadoFinal);

    }
}
