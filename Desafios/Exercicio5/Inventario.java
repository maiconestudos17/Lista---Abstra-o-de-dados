package Desafios.Exercicio5;

import java.util.ArrayList;

public class Inventario {
     private ArrayList<InventarioDeRPG> itens = new ArrayList<>();

    public boolean adicionar(InventarioDeRPG i) {
        if (i == null || itens.size() >= 5) {
            return false;
        }

        if (pesoTotal() + i.getPeso() > 20) {
            return false;
        }

        itens.add(i);
        return true;
    }

    public boolean remover(String nome) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getNome().equals(nome)) {
                itens.remove(i);
                return true;
            }
        }

        return false;
    }

    public double pesoTotal() {
        double total = 0;

        for (InventarioDeRPG i : itens) {
            total += i.getPeso();
        }

        return total;
    }

    public void listar() {
        for (InventarioDeRPG i : itens) {
            System.out.println(i.getNome() + " - " + i.getPeso() + " kg");
        }
    }
}
