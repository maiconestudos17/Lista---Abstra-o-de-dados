package Aquecimento.Exercicio2;

public class Main {
    public static void main(String[] args) {
                Termometro t = new Termometro(25);

        System.out.println(t.getFahrenheit());
        System.out.println(t.getKelvin());
        System.out.println(t.setCelsius(-300));
        System.out.println(t.getCelsius());
    }
    }

