/*
 */
package lab3p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Pokémon {

    private String nombrePok;
    private int numentradapokédex;
    private String naturaleza;
    private boolean atrapado;

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

    public boolean setNaturaleza(String naturaleza) {
        if (naturaleza.equalsIgnoreCase("Timido")
                || naturaleza.equalsIgnoreCase("Energetico")
                || naturaleza.equalsIgnoreCase("Misterioso")) {
            this.naturaleza = naturaleza;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAtrapado() {
        return atrapado;
    }

    public void setAtrapado(boolean atrapado) {
        this.atrapado = atrapado;
    }

    @Override
    public String toString() {
        return "Pok\u00e9mon{" + "nombrePok=" + nombrePok + ", numentradapok\u00e9dex=" + numentradapokédex + ", naturaleza=" + naturaleza + ", atrapado=" + atrapado + '}';
    }

}
