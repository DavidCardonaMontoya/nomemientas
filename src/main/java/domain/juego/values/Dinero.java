package domain.juego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Dinero implements ValueObject<Integer> {
    private final Integer dinero;

    public Dinero(Integer dinero) {
        this.dinero = Objects.requireNonNull(dinero, "Es obligatorio ingresar un monto de dinero");
        if (dinero < 0) {
            throw new IllegalArgumentException("Acá no dejamos jugar a morosos.");
        }
    }

    @Override
    public Integer value() {
        return dinero;
    }

    public Dinero incrementar(Dinero monto) {
        return new Dinero(dinero+monto.value());
    }

    public Dinero decrementar(Dinero monto) {
        return new Dinero(dinero-monto.value());
    }
}
