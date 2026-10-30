package Desafios.Exercicio7;

public class Main {
    public static void main(String[] args) {

        Forma[] formas = new Forma[3];

        formas[0] = new Retangulo(3, 4);
        formas[1] = new Circulo(1);
        formas[2] = new Triangulo(3, 4, 5);

        double soma = 0;
        double maiorArea = 0;
        String maiorForma = "";

        for (int i = 0; i < formas.length; i++) {

            System.out.printf("%s: área %.2f, perímetro %.2f%n",
                    formas[i].nome(),
                    formas[i].area(),
                    formas[i].perimetro());

            soma += formas[i].area();

            if (formas[i].area() > maiorArea) {
                maiorArea = formas[i].area();
                maiorForma = formas[i].nome();
            }
        }

        System.out.printf("Soma das áreas: %.2f%n", soma);
        System.out.println("Maior área: " + maiorForma);
    }
}
