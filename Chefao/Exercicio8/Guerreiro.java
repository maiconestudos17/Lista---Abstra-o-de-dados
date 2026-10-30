package Chefao.Exercicio8;

import java.util.Random;

public class Guerreiro extends Personagem {
    private Random random;

    public Guerreiro(String nome, Random random) {
        super(nome);
        this.random = random;
    }

    protected int calcularAtaque() {
        return random.nextInt(8) + 8;
    }

    public void receberDano(int d) {
        if (d <= 0) {
            return;
        }

        int danoReduzido = (int) (d * 0.8);
        super.receberDano(danoReduzido);
    }
}
