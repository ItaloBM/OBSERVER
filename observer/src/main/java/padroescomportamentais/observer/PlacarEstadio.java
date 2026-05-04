package padroescomportamentais.observer;

public class PlacarEstadio implements Observador {
    private String ultimaMensagem;

    @Override
    public void atualizar(String evento, int gols) {
        this.ultimaMensagem = "ESTÁDIO - " + evento + "! Placar alterado para: " + gols;
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }
}