package domain.juego;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.juego.factory.JugadorFactory;
import domain.juego.values.*;

import java.util.Map;

public class Juego extends AggregateEvent<JuegoID> {

    protected Boolean jugando;
    protected Map<JugadorID, Jugador> jugadoresActivos;
    protected Map<JugadorID, Jugador> jugadoresEliminados;
    protected RondaID rondaID;
    protected Boolean juegoTerminado;

    public Juego(JuegoID entityId, JugadorFactory jugadorFactory) {
        super(entityId);
//        appendChange(new JuegoCreado(entityId)).apply();
//        jugadorFactory.jugadores()
//                .forEach(jugador -> adicionarJugador(jugador.identity(), jugador.nombre(), jugador.capital()));
    }

    public Boolean jugando() {
        return jugando;
    }

    public void agregarJugador(JugadorID jugadorID, Nombre nombre, Dinero capital){

    }

    public void iniciarJuego() {

    }

    public void iniciarRonda() {

    }


}
