package padroescomportamentais.observer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PartidaTest {

    @Test
    void deveNotificarTodosOsInscritosQuandoSairGol() {
        // 1. Criamos a partida (Emissora)
        Partida partida = new Partida();

        // 2. Criamos os sistemas (Assinantes)
        PlacarEstadio placar = new PlacarEstadio();
        AplicativoTorcedor app = new AplicativoTorcedor();

        // 3. Inscrevemos os sistemas na partida
        partida.adicionarObservador(placar);
        partida.adicionarObservador(app);

        // 4. Acontece a ação!
        partida.marcarGol();

        // 5. Verificamos se todo mundo ouviu e se atualizou sozinho
        assertEquals("ESTÁDIO - GOL! Placar alterado para: 1", placar.getUltimaMensagem());
        assertEquals("APP - Notificação de GOL! O jogo agora está 1", app.getUltimaMensagem());
    }
}