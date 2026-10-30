package Desafios.Exercicio7;

public class Triangulo implements Forma {
    private double a;
    private double b;
    private double c;

    public Triangulo(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0 ||
            a >= b + c || b >= a + c || c >= a + b) {

            throw new IllegalArgumentException("Triângulo inválido");
        }

        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double area() {
        double p = (a + b + c) / 2;

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimetro() {
        return a + b + c;
    }

    public String nome() {
        return "Triângulo";
    }
}
