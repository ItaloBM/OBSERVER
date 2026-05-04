package padroescomportamentais.observer;

import java.util.ArrayList;
import java.util.List;

public class Partida {
    private int gols = 0;
    // Aqui está a mágica: A partida guarda uma lista de interfaces genéricas, não de classes específicas!
    private List<Observador> inscritos = new ArrayList<>();

    // Método para inscrever alguém
    public void adicionarObservador(Observador obs) {
        this.inscritos.add(obs);
    }

    // Método para desinscrever alguém
    public void removerObservador(Observador obs) {
        this.inscritos.remove(obs);
    }

    public void marcarGol() {
        this.gols++;
        notificarTodos("GOL");
    }

    // O megafone! Avisa todo mundo da lista!
    private void notificarTodos(String evento) {
        for (Observador obs : inscritos) {
            obs.atualizar(evento, this.gols);
        }
    }
}