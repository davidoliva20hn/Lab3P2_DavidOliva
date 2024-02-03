/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
class GrassType extends Pokémon{
       String habitat;
    int dominio;

    public GrassType() {
    }

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

    public boolean setDominio(int dominio) {
        if (dominio >= 0 && dominio <= 100) {
            this.dominio = dominio;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString()+"GrassType{" + "habitat:" + habitat + ", dominio:" + dominio + '}';
    } 
}
