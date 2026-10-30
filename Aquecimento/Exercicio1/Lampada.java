package Aquecimento.Exercicio1;

public class Lampada {
    private boolean ligada;
    private int vezesLigada;

    public void ligar() {
        if (!ligada) {
            ligada = true;
            vezesLigada++;
        }
    }

    public void desligar() {
        ligada = false;
    }

    public void alternar() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }

    public boolean estaLigada() {
        return ligada;
    }

    public int getVezesLigada() {
        return vezesLigada;
    }
}

