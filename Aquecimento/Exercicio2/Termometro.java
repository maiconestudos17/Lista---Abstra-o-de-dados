package Aquecimento.Exercicio2;

class Termometro {
    private double celsius;

    public Termometro(double celsius) {
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Temperatura invalida");
        }
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return celsius * 9 / 5 + 32;
    }

    public double getKelvin() {
        return celsius + 273.15;
    }

    public boolean setCelsius(double novo) {
        if (novo < -273.15 || Double.isNaN(novo)) {
            return false;
        }

        celsius = novo;
        return true;
    }
}
