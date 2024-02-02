/*
 */
package lab3p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class GrassType extends Pokémon {

    String habitat;
    int dominio;

    public GrassType(String habitat, int dominio) {
        this.habitat = habitat;
        if (dominio >= 0 && dominio <= 100) {
            this.dominio = dominio;
        }
    }

    public GrassType(String habitat, int dominio, String nombrePok, int numentradapokédex, String naturaleza, boolean atrapado) {
        super(nombrePok, numentradapokédex, naturaleza, atrapado);
        this.habitat = habitat;
        if (dominio >= 0 && dominio <= 100) {
            this.dominio = dominio;
        }
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getDominio() {
        return dominio;
    }

    public void setDominio(int dominio) {
        if (dominio >= 0 && dominio <= 100) {
            this.dominio = dominio;
        }
    }

    @Override
    public String toString() {
        return "GrassType{" + "habitat=" + habitat + ", dominio=" + dominio + '}';
    }

}
