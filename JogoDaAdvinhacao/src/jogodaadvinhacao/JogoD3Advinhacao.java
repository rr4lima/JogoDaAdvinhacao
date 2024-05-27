package jogodaadvinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdvinhacao {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Random n = new Random();
        int numeroSecreto = n.nextInt(10) + 1;

        Scanner objLer = new Scanner(System.in);
        System.out.println("Bem vindo ao Jogo!");
        System.out.println("Qual é o seu nome?");

        String nome = objLer.nextLine();
        System.out.println("Olá," + nome + "! Vamos começar.");

        int t = 0;
        int p = 0;

        while (p != numeroSecreto) {
            System.out.println("Advinhe o número secreto. (entre 1 e 10)");
            p = objLer.nextInt();
            t++;

            if (p == numeroSecreto) {
                System.out.println("Parabéns, " + nome + ". Você advinhou o número screto em " + t + " tentativas!");
            }
            else if (p < numeroSecreto) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("O número é menor.");

            }

        }

    }

}
