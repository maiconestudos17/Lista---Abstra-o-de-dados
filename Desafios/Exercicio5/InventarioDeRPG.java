package Desafios.Exercicio5;



public class InventarioDeRPG {
    private String nome;
    private double peso;

    public InventarioDeRPG(String nome, double peso) {
        if (nome == null || nome.isBlank() || peso <= 0 || !Double.isFinite(peso)) {
            throw new IllegalArgumentException("Item invalido");
        }

        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }
}








