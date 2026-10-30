package Aquecimento.Exercicio3;

public class Main {
    public static void main(String[] args) {
        PlacarDeFutebol p = new PlacarDeFutebol("Tigres", "Leões");

        p.golCasa();
        p.golCasa();
        p.golVisitante();
        p.anularGolVisitante();
        p.anularGolVisitante();

        System.out.println(p.resultado());
        System.out.println(p.vencedor());
    }
}
