package domain.juego.values;

import co.com.sofka.domain.generic.ValueObject;

public class Estado implements ValueObject<Estados> {
    private final Estados estado;

    public Estado(Estados estado) {
        this.estado = estado;
    }

    @Override
    public Estados value() {
        return estado;
    }
}
