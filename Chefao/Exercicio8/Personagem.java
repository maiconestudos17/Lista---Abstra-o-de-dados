package Chefao.Exercicio8;

abstract class Personagem {
    private String nome;
    private int vida;

    public Personagem(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public void receberDano(int d) {
        if (d <= 0) {
            return;
        }

        vida -= d;

        if (vida < 0) {
            vida = 0;
        }
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public int getVida() {
        return vida;
    }

    public String getNome() {
        return nome;
    }

    public int atacar(Personagem alvo) {
        if (!estaVivo() || !alvo.estaVivo()) {
            return 0;
        }

        int dano = calcularAtaque();
        alvo.receberDano(dano);

        return dano;
    }

    protected abstract int calcularAtaque();
}

