package domain.juego;

import co.com.sofka.domain.generic.Entity;
import domain.juego.values.*;

public class Jugador extends Entity<JugadorID> {

    private final Nombre nombre;
    private Dinero capital;
    private Estado estado;

    public Jugador(JugadorID entityId, Nombre nombre, Dinero capital) {
        super(entityId);
        this.nombre = nombre;
        this.capital = capital;
    }

    public void incrementarCapital(Dinero monto){
        this.capital = this.capital.incrementar(monto);
    }

    public void decrementarCapital(Dinero monto){
        this.capital = this.capital.incrementar(monto);
    }

    public void proponer(Apuesta apuesta, Adivinanza adivinanza) {

    }

    public Nombre getNombre() {
        return nombre;
    }

    public Dinero getCapital() {
        return capital;
    }

    public Estado getEstado() {
        return estado;
    }
}
