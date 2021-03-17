package domain.juego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Frecuencia implements ValueObject<Integer> {
    private final Integer frecuencia;

    public Frecuencia(Integer frecuencia) {
        this.frecuencia = Objects.requireNonNull(frecuencia, "Es necesario ingresar el número de veces que la cara se repite por ronda.");
        if (frecuencia < 3 || frecuencia > 6){
            throw new IllegalArgumentException("No es válido dentro del juego.");
        }
    }

    @Override
    public Integer value() {
        return null;
    }
}
