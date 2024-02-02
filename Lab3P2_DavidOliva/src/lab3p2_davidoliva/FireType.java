/*
 */
package lab3p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class FireType extends Pokémon {

    int potenciallamas;

    public FireType() {
    }

    public FireType(int potenciallamas, String nombrePok, int numentradapokédex, String naturaleza, boolean atrapado) {
        super(nombrePok, numentradapokédex, naturaleza, atrapado);
        this.potenciallamas = potenciallamas;
    }

    public int getPotenciallamas() {
        return potenciallamas;
    }

    public void setPotenciallamas(int potenciallamas) {
        this.potenciallamas = potenciallamas;
    }

    @Override
    public String toString() {
        return "FireType{" + "potenciallamas=" + potenciallamas + '}';
    }

}
