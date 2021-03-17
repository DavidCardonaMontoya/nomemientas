package domain.juego.factory;

import domain.juego.Jugador;
import domain.juego.values.Dinero;
import domain.juego.values.JugadorID;
import domain.juego.values.Nombre;

import java.util.HashSet;
import java.util.Set;

public class JugadorFactory {
    private final Set<Jugador> jugadores;

    private JugadorFactory() {
        jugadores = new HashSet<>();
    }

    public static JugadorFactory constructor() {
        return new JugadorFactory();
    }

    public JugadorFactory agregarJugador(JugadorID jugadorID, Nombre nombre, Dinero capital) {
        jugadores.add(new Jugador(jugadorID, nombre, capital));
        return this;
    }

    public Set<Jugador> jugadores() {
        return jugadores;
    }
}
