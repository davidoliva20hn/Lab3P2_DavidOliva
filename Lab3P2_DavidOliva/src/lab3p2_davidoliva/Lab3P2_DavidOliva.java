/*
 */
package lab3p2_davidoliva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Lab3P2_DavidOliva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pokémon> pokomon = new ArrayList();
        ArrayList<Pokeball> pokeball = new ArrayList();
        Scanner lea = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        int opc = 0;
        do {
            System.out.println("""
                       --------- MENU PRINCIPAL -----------
                               1. CREAR POKEMON 
                               2. CREAR POKEBOLA
                               3. LISTAR POKEMON 
                               4. CAPTURAR POKEMON 
                               5. MODIFICAR POKEMON 
                               6. Salir """);
            opc = lea.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Ingrese el nombre del pokemon:");
                    String nombrePok = leer.nextLine();
                    System.out.println("Ingrese numero de entrada en la pokédex:");
                    int numentradapokédex = lea.nextInt();
                    boolean valornaturaleza = false;
                    String naturaleza;
                    do {
                        System.out.println("Ingrese la naturalesa:");
                        naturaleza = leer.nextLine();
                        valornaturaleza = new Pokémon().setNaturaleza(naturaleza);
                        if (valornaturaleza == false) {
                            System.out.println("la naturalesa solo pude ser: Timido, Energetico, Misterioso");
                        }
                    } while (valornaturaleza == false);
                    boolean atrapado = false;
                    pokomon.add(new Pokémon(nombrePok, numentradapokédex, naturaleza, atrapado));
                }//fin case 1
                case 2 -> {
                    System.out.println("Ingrese el color de la pokebola:");
                    String color = leer.nextLine();
                    System.out.println("Ingrese el numero de serie de la pokebola:");
                    int numserie = lea.nextInt();
                    int numeficiencia;
                    boolean valoreficiencia = false;
                    do {
                        System.out.println("Ingrese el numero de eficiencia de la pokebola:");
                        numeficiencia = lea.nextInt();
                        valoreficiencia = new Pokeball().setNumeficienciaball(numeficiencia);
                        if (valoreficiencia == false) {
                            System.out.println("El numero de eficiencia solo pude se de 1-3 ");
                        }
                    } while (valoreficiencia == false);
                    pokeball.add(new Pokeball() );
                }//fin case 2
                case 3->{
                    
                }
            }//fin switch
        } while (opc != 6);//fin do
    }//fin main

}// fin clase
