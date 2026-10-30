package Desafios.Exercicio6;

public class CofreComSenha {

    private String senha;
    private int tentativasErradas;
    private boolean bloqueado;

    public CofreComSenha(String senha) {
        if (senha == null || senha.length() < 6) {
            throw new IllegalArgumentException("Senha invalida");
        }

        this.senha = senha;
    }

    public boolean abrir(String tentativa) {
        if (bloqueado) {
            return false;
        }

        if (senha.equals(tentativa)) {
            tentativasErradas = 0;
            return true;
        }

        tentativasErradas++;

        if (tentativasErradas >= 3) {
            bloqueado = true;
        }

        return false;
    }

    public boolean trocarSenha(String antiga, String nova) {
        if (bloqueado) {
            return false;
        }

        if (!senha.equals(antiga)) {
            return false;
        }

        if (nova == null || nova.length() < 6) {
            return false;
        }

        senha = nova;
        return true;
    }

    public boolean estaBloqueado() {
        return bloqueado;
    }
    
}
