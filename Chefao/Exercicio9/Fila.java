package Chefao.Exercicio9;

public class Fila {
    private String[] nomes;
    private int inicio;
    private int fim;
    private int quantidade;

    public Fila() {
        nomes = new String[3];
        inicio = 0;
        fim = 0;
        quantidade = 0;
    }

    public boolean entrar(String nome) {
        if (quantidade == nomes.length || nome == null || nome.isBlank()) {
            return false;
        }

        nomes[fim] = nome;
        fim = (fim + 1) % nomes.length;
        quantidade++;

        return true;
    }

    public String atender() {
        if (estaVazia()) {
            return null;
        }

        String nome = nomes[inicio];
        nomes[inicio] = null;

        inicio = (inicio + 1) % nomes.length;
        quantidade--;

        return nome;
    }

    public String proximo() {
        if (estaVazia()) {
            return null;
        }

        return nomes[inicio];
    }

    public int tamanho() {
        return quantidade;
    }

    public boolean estaVazia() {
        return quantidade == 0;
    }
}


