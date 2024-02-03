/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_davidoliva;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class FireType extends Pokémon{
    int potenciallama;

    public FireType() {
    }

    public FireType(int potenciallama) {
        this.potenciallama = potenciallama;
    }

    public FireType(int potenciallama, String nombrePok, int numentradapokédex, String naturaleza, boolean atrapado) {
        super(nombrePok, numentradapokédex, naturaleza, atrapado);
        this.potenciallama = potenciallama;
    }

    public int getPotenciallama() {
        return potenciallama;
    }

    public void setPotenciallama(int potenciallama) {
        this.potenciallama = potenciallama;
    }

    @Override
    public String toString() {
        return super.toString()+"FireType{" + "potenciallama=" + potenciallama + '}';
    }
    
}
