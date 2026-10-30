package Aquecimento.Exercicio1;

public class Main {
    public static void main(String[] args) {
        Lampada l = new Lampada();

        l.ligar();
        l.ligar();
        l.alternar();
        l.alternar();

        System.out.println(l.estaLigada());
        System.out.println(l.getVezesLigada());
    }
    
}
