package Desafios.Exercicio5;

public class Main {
    public static void main(String[] args) {
        Inventario inv = new Inventario();

        inv.adicionar(new InventarioDeRPG("Espada", 8));
        inv.adicionar(new InventarioDeRPG("Escudo", 7));
        inv.adicionar(new InventarioDeRPG("Poção", 1));

        System.out.println(inv.adicionar(new InventarioDeRPG("Armadura", 10)));
        System.out.println(inv.pesoTotal());

        inv.listar();
    }
}
