package Chefao.Exercicio8;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random(42);

        Guerreiro guerreiro = new Guerreiro("Guerreiro", random);
        Mago mago = new Mago("Mago");

        Personagem atacante = guerreiro;
        Personagem defensor = mago;

        int turno = 1;

        while (guerreiro.estaVivo() && mago.estaVivo()) {
            int dano = atacante.atacar(defensor);

            System.out.println("Turno " + turno + ": "
                    + atacante.getNome() + " causa " + dano
                    + " de dano. " + defensor.getNome()
                    + " está com " + defensor.getVida() + " de vida.");

            Personagem troca = atacante;
            atacante = defensor;
            defensor = troca;

            turno++;
        }

        if (guerreiro.estaVivo()) {
            System.out.println("Vencedor: " + guerreiro.getNome());
        } else {
            System.out.println("Vencedor: " + mago.getNome());
        }
    }
}
