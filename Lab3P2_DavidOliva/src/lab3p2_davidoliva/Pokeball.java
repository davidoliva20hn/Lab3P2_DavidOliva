/*
 */
package lab3p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Pokeball {

    private String color;
    private int numserie;
    private int numeficiencia;

    public Pokeball() {
    }

    public Pokeball(String color, int numserie, int numeficiencia) {
        this.color = color;
        this.numserie = numserie;
        if (numeficiencia >= 1 && numeficiencia <= 3) {
            this.numeficiencia = numeficiencia;
        }
    }

    public String getColorball() {
        return color;
    }

    public void setColorball(String color) {
        this.color = color;
    }

    public int getNumserieball() {
        return numserie;
    }

    public void setNumserieball(int numserie) {
        this.numserie = numserie;
    }

    public int getNumeficienciaball() {
        return numeficiencia;
    }

    public boolean setNumeficienciaball(int numeficiencia) {
        if (numeficiencia >= 1 && numeficiencia <= 3) {
            this.numeficiencia = numeficiencia;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Pokeball{" + "Color:" + color + ", Numero de serie:" + numserie + ", Numero de eficiencia:" + numeficiencia + '}';
    }

}
