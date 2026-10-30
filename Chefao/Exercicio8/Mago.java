package Chefao.Exercicio8;


    public class Mago extends Personagem {
    private int mana;

    public Mago(String nome) {
        super(nome);
        mana = 30;
    }

    protected int calcularAtaque() {
        if (mana >= 10) {
            mana -= 10;
            return 20;
        }

        return 5;
    }
}
    
