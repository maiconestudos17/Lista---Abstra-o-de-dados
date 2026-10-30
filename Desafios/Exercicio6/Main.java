package Desafios.Exercicio6;

public class Main {
    public static void main(String[] args) {
        CofreComSenha c = new CofreComSenha("dragao42");

        System.out.println(c.abrir("abc"));
        System.out.println(c.abrir("dragao42"));
        System.out.println(c.trocarSenha("dragao42", "123"));

        c.abrir("x");
        c.abrir("y");
        c.abrir("z");

        System.out.println(c.estaBloqueado());
        System.out.println(c.abrir("dragao42"));
    }
}
