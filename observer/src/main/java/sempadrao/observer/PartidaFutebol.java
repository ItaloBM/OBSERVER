package sempadrao.observer;

public class PartidaFutebol {
    // O PROBLEMA: A Partida conhece as classes exatas do Placar e do App.
    // Viola o princípio de Inversão de Dependência e o Aberto/Fechado.
    private Placar placar;
    private AppTorcedor app;
    private int gols = 0;

    public PartidaFutebol() {
        this.placar = new Placar();
        this.app = new AppTorcedor();
    }

    public String marcarGol() {
        gols++;
        // Se quisermos adicionar a TV aqui, teríamos que modificar esta classe inteira!
        String logPlacar = placar.atualizarVisor(gols);
        String logApp = app.enviarPush(gols);

        return logPlacar + " | " + logApp;
    }
}