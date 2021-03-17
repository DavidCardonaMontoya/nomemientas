package domain.juego.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cara implements ValueObject<Integer> {
    private final Integer cara;

    public Cara(Integer cara) {
        this.cara = Objects.requireNonNull(cara, "Es necesario ingresar el número de la cara.");
        if (cara <= 0 || cara > 6) {
            throw new IllegalArgumentException("El número de la cara debe estar en [1, 6].");
        }
    }

    @Override
    public Integer value() {
        return cara;
    }
}
