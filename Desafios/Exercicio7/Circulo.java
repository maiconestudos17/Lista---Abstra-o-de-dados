package Desafios.Exercicio7;


    public class Circulo implements Forma {
    private double raio;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio invalido");
        }

        this.raio = raio;
    }

    public double area() {
        return Math.PI * raio * raio;
    }

    public double perimetro() {
        return 2 * Math.PI * raio;
    }

    public String nome() {
        return "Círculo";
    }
}
    

