package Desafios.Exercicio4;

public class Main {
    public static void main(String[] args) {
        PilhaDePratos p = new PilhaDePratos(3);

        p.empilhar(10);
        p.empilhar(20);
        p.empilhar(30);

        System.out.println(p.empilhar(40));
        System.out.println(p.desempilhar());
        System.out.println(p.espiar());
        System.out.println(p.tamanho());
    }   
}
