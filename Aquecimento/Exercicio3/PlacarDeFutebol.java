package Aquecimento.Exercicio3;

public class PlacarDeFutebol {
    private String casa;
    private String visitante;
    private int golsCasa;
    private int golsVisitante;

    public PlacarDeFutebol(String casa, String visitante) {
        this.casa = casa;
        this.visitante = visitante;
    }

    public void golCasa() {
        golsCasa++;
    }

    public void golVisitante() {
        golsVisitante++;
    }

    public void anularGolCasa() {
        if (golsCasa > 0) {
            golsCasa--;
        }
    }

    public void anularGolVisitante() {
        if (golsVisitante > 0) {
            golsVisitante--;
        }
    }

    public String resultado() {
        return casa + " " + golsCasa + " x " + golsVisitante + " " + visitante;
    }

    public String vencedor() {
        if (golsCasa > golsVisitante) {
            return casa;
        } else if (golsVisitante > golsCasa) {
            return visitante;
        } else {
            return "Empate";
        }
    }
}
