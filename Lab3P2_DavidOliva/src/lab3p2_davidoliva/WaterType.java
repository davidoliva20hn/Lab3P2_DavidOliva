/*
 */
package lab3p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class WaterType extends Pokémon {

    private boolean vivirfueraagua;
    private int rapideznadar;

    public WaterType() {
    }

    public WaterType(boolean vivirfueraagua, int rapideznadar) {
        this.vivirfueraagua = vivirfueraagua;
        this.rapideznadar = rapideznadar;
    }

    public WaterType(boolean vivirfueraagua, int rapideznadar, String nombrePok, int numentradapokédex,
             String naturaleza, boolean atrapado) {
        super(nombrePok, numentradapokédex, naturaleza, atrapado);
        this.vivirfueraagua = vivirfueraagua;
        this.rapideznadar = rapideznadar;
    }

    public boolean isVivirfueraagua() {
        return vivirfueraagua;
    }

    public void setVivirfueraagua(boolean vivirfueraagua) {
        this.vivirfueraagua = vivirfueraagua;
    }

    public int getRapideznadar() {
        return rapideznadar;
    }

    public void setRapideznadar(int rapideznadar) {
        this.rapideznadar = rapideznadar;
    }

    @Override
    public String toString() {
        return "WaterType{" + "vivirfueraagua=" + vivirfueraagua + ", rapideznadar=" + rapideznadar + '}';
    }

}
