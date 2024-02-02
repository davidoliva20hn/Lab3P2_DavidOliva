/*
 */
package lab3p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Pokémon {
    String nombrePok;
    int numentradapokédex;
    String naturaleza;
    boolean atrapado;

    public Pokémon() {
    }

    public Pokémon(String nombrePok, int numentradapokédex, String naturaleza, boolean atrapado) {
        this.nombrePok = nombrePok;
        this.numentradapokédex = numentradapokédex;
        this.naturaleza = naturaleza;
        this.atrapado = atrapado;
    }

    public String getNombrePok() {
        return nombrePok;
    }

    public void setNombrePok(String nombrePok) {
        this.nombrePok = nombrePok;
    }

    public int getNumentradapokédex() {
        return numentradapokédex;
    }

    public void setNumentradapokédex(int numentradapokédex) {
        this.numentradapokédex = numentradapokédex;
    }

    public String getNaturaleza() {
        return naturaleza;
    }

    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }
    
}
