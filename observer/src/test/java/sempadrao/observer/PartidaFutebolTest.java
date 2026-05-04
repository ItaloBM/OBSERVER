package sempadrao.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartidaFutebolTest {

    @Test
    void deveNotificarSistemasDeFormaAcoplada() {
        PartidaFutebol partida = new PartidaFutebol();

        String resultado = partida.marcarGol();

        assertTrue(resultado.contains("Placar do Estádio atualizado: 1 gol(s)"));
        assertTrue(resultado.contains("Notificação no Celular: GOOOOL! Placar agora é 1"));
    }
}