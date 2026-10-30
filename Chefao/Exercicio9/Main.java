package Chefao.Exercicio9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila fila = new Fila();

        while (sc.hasNextLine()) {
            String linha = sc.nextLine().trim();

            if (linha.equals("FIM")) {
                break;
            }

            if (linha.startsWith("ENTRA ")) {
                String nome = linha.substring(6).trim();

                if (fila.entrar(nome)) {
                    System.out.println(nome + " entrou na fila");
                } else {
                    System.out.println("Fila cheia ou nome invalido");
                }

            } else if (linha.equals("ATENDE")) {
                String nome = fila.atender();

                if (nome != null) {
                    System.out.println("Atendendo: " + nome);
                } else {
                    System.out.println("Fila vazia");
                }

            } else if (linha.equals("PROXIMO")) {
                String nome = fila.proximo();

                if (nome != null) {
                    System.out.println("Próximo: " + nome);
                } else {
                    System.out.println("Fila vazia");
                }

            } else if (linha.equals("TAMANHO")) {
                System.out.println("Pessoas na fila: " + fila.tamanho());
            }
        }

        sc.close();
    }
    
}
