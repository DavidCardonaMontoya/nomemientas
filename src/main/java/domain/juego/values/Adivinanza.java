package domain.juego.values;

import co.com.sofka.domain.generic.ValueObject;

public class Adivinanza implements ValueObject<Adivinanza.Par> {
    private final Cara cara;
    private final Frecuencia frecuencia;

    public Adivinanza(Cara cara, Frecuencia frecuencia) {
        this.cara = cara;
        this.frecuencia = frecuencia;
    }

    @Override
    public Par value() {
        return new Par() {
            @Override
            public Cara cara() {
                return cara;
            }

            @Override
            public Frecuencia frecuencia() {
                return frecuencia;
            }
        };
    }

    public interface Par {
        Cara cara();
        Frecuencia frecuencia();
    }
}
