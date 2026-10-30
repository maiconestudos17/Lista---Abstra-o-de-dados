package Desafios.Exercicio4;

class PilhaDePratos {

    private int[] dados;
    private int topo;

    public PilhaDePratos(int capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade invalida");
        }

        dados = new int[capacidade];
        topo = -1;
    }

    public boolean empilhar(int x) {
        if (estaCheia()) {
            return false;
        }

        topo++;
        dados[topo] = x;
        return true;
    }

    public int desempilhar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return -1;
        }

        int valor = dados[topo];
        topo--;
        return valor;
    }

    public int espiar() {
        if (estaVazia()) {
            System.out.println("Pilha vazia");
            return -1;
        }

        return dados[topo];
    }

    public boolean estaVazia() {
        return topo == -1;
    }

    public boolean estaCheia() {
        return topo == dados.length - 1;
    }

    public int tamanho() {
        return topo + 1;
    }
}
