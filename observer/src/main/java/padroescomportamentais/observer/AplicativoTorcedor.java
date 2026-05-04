package padroescomportamentais.observer;

public class AplicativoTorcedor implements Observador {
    private String ultimaMensagem;

    @Override
    public void atualizar(String evento, int gols) {
        this.ultimaMensagem = "APP - Notificação de " + evento + "! O jogo agora está " + gols;
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }
}