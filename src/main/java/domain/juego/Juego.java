package domain.juego;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.juego.factory.JugadorFactory;
import domain.juego.values.JuegoID;
import domain.juego.values.JugadorID;
import domain.juego.values.RondaID;

import java.util.Map;

public class Juego extends AggregateEvent<JuegoID> {

    protected Boolean jugando;
    protected Map<JugadorID, Jugador> jugadores;
    protected RondaID rondaID;

    public Juego(JuegoID entityId, JugadorFactory jugadorFactory) {
        super(entityId);
//        appendChange(new JuegoCreado(entityId)).apply();
//        jugadorFactory.jugadores()
//                .forEach(jugador -> adicionarJugador(jugador.identity(), jugador.nombre(), jugador.capital()));
    }


}
