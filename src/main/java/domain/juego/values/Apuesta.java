package domain.juego.values;

import co.com.sofka.domain.generic.ValueObject;

public class Apuesta implements ValueObject<Dinero> {
    private final Dinero apuesta;

    public Apuesta(Dinero apuesta) {
        this.apuesta = apuesta;
    }

    @Override
    public Dinero value() {
        return apuesta;
    }
}
