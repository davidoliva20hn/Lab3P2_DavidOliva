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
        Scanner leer = new Scanner(System.in);
        Scanner lea = new Scanner(System.in);
        ArrayList<Pokémon> pokomon = new ArrayList();
        ArrayList<Pokeball> pokeball = new ArrayList();
        int opc = 0;
        do {
            System.out.println("""
                       --------- MENU PRINCIPAL -----------
                               1. CREAR POKEMON 
                               2. CREAR POKEBOLA
                               3. LISTAR POKEMON 
                               4. ELIMINAR POKEMON
                               5. CAPTURAR POKEMON 
                               5. MODIFICAR POKEMON 
                               6. Salir """);
            System.out.println("Ingrese una opcion:");
            opc = lea.nextInt();
            switch (opc) {
                case 1 -> {
                    int opcsub = 0;
                    System.out.println("Tipo Pokemon\n"
                            + "1. WaterType\n"
                            + "2. GrassType\n"
                            + "3. FireType"
                    );
                    System.out.println("Ingrese una opcion:");
                    opcsub = lea.nextInt();
                    switch (opcsub) {
                        case 1 -> {
                            System.out.println("Ingrese el nombre del pokemon:");
                            String nombrePok = leer.next();
                            System.out.println("Ingrese numero de entrada en la pokédex:");
                            int numentradapokédex = lea.nextInt();
                            boolean valornaturaleza = false;
                            String naturaleza;
                            do {
                                System.out.println("Ingrese la naturalesa:");
                                naturaleza = leer.next();
                                valornaturaleza = new Pokémon().setNaturaleza(naturaleza);
                                if (valornaturaleza == false) {
                                    System.out.println("la naturalesa solo pude ser: Timido, Energetico, Misterioso");
                                }
                            } while (valornaturaleza == false);
                            boolean atrapado = false;
                            System.out.println("Ingrese si puede vivir fuera del agua o no [si/no]:");
                            String vivir = leer.next();
                            boolean vivirfueraagua;
                            if (vivir.equalsIgnoreCase("si")) {
                                vivirfueraagua = true;
                            } else {
                                vivirfueraagua = false;
                            }
                            System.out.println("Ingrese su rapidez al nadar:");
                            int rapideznadar = lea.nextInt();
                            pokomon.add(new WaterType(vivirfueraagua, rapideznadar, nombrePok, numentradapokédex,
                                    naturaleza, atrapado));
                        }
                        case 2 -> {
                            System.out.println("Ingrese el nombre del pokemon:");
                            String nombrePok = leer.next();
                            System.out.println("Ingrese numero de entrada en la pokédex:");
                            int numentradapokédex = lea.nextInt();
                            boolean valornaturaleza = false;
                            String naturaleza;
                            do {
                                System.out.println("Ingrese la naturalesa:");
                                naturaleza = leer.next();
                                valornaturaleza = new Pokémon().setNaturaleza(naturaleza);
                                if (valornaturaleza == false) {
                                    System.out.println("la naturalesa solo pude ser: Timido, Energetico, Misterioso");
                                }
                            } while (valornaturaleza == false);
                            boolean atrapado = false;
                            System.out.println("Ingrese el habitat:");
                            String habitat = leer.next();
                            int dominio = 0;
                            boolean valordominio = false;
                            do {
                                System.out.println("Ingrese el dominio sobre las plantas:");
                                dominio = lea.nextInt();
                                valordominio = new GrassType().setDominio(dominio);
                                if (valordominio == false) {
                                    System.out.println("el dominio sobre las plantas solo pude ser (0 - 100)");
                                }
                            } while (valordominio == false);
                            pokomon.add(new GrassType(habitat, dominio, nombrePok, numentradapokédex, naturaleza, atrapado));
                        }
                        case 3 -> {
                            System.out.println("Ingrese el nombre del pokemon:");
                            String nombrePok = leer.next();
                            System.out.println("Ingrese numero de entrada en la pokédex:");
                            int numentradapokédex = lea.nextInt();
                            boolean valornaturaleza = false;
                            String naturaleza;
                            do {
                                System.out.println("Ingrese la naturalesa:");
                                naturaleza = leer.next();
                                valornaturaleza = new Pokémon().setNaturaleza(naturaleza);
                                if (valornaturaleza == false) {
                                    System.out.println("la naturalesa solo pude ser: Timido, Energetico, Misterioso");
                                }
                            } while (valornaturaleza == false);
                            boolean atrapado = false;
                            System.out.println("Ingrese a la potencia de las llamas:");
                            int potenciallama = lea.nextInt();
                            pokomon.add(new FireType(potenciallama, nombrePok, numentradapokédex, naturaleza, atrapado));
                        }

                    }//fin submenu
                }//fin case 1
                case 2 -> {
                    System.out.println("Ingrese el color de la pokebola:");
                    String color = leer.next();
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
                    pokeball.add(new Pokeball(color, numserie, numeficiencia));
                }//fin case 2
                case 3 -> {
                    if (pokomon.isEmpty()) {
                        System.out.println("No hay pokemons en la lista");
                        break;
                    }
                    for (int i = 0; i < pokomon.size(); i++) {
                        if (pokomon.get(i) instanceof FireType) {
                            System.out.println(pokomon.get(i));
                        } else if (pokomon.get(i) instanceof WaterType) {
                            System.out.println(pokomon.get(i));
                        } else if (pokomon.get(i) instanceof GrassType) {
                            System.out.println(pokomon.get(i));
                        }
                    }
                }
                case 4 -> {
                    if (pokomon.isEmpty()) {
                        System.out.println("No hay pokemons en la lista");
                        break;
                    }
                    System.out.println("Ingrese el tipo de pokemon que desea eliminar:");
                    String tipo = leer.next();
                    for (int i = 0; i < pokomon.size(); i++) {
                        if (tipo.equalsIgnoreCase("fire")) {
                            if (pokomon.get(i) instanceof FireType) {
                                System.out.println(pokomon.indexOf(pokomon.get(i)) + ". " + pokomon.get(i));
                            }
                        } else if (tipo.equalsIgnoreCase("water")) {
                            if (pokomon.get(i) instanceof WaterType) {
                                System.out.println(pokomon.indexOf(pokomon.get(i)) + ". " + pokomon.get(i));
                            }
                        } else if (tipo.equalsIgnoreCase("grass")) {
                            if (pokomon.get(i) instanceof GrassType) {
                                System.out.println(pokomon.indexOf(pokomon.get(i)) + ". " + pokomon.get(i));
                            }
                        }
                    }
                    System.out.println("Ingrese la posicion del pokemon a eliminar:");
                    int poseliminar = lea.nextInt();
                    pokomon.remove(poseliminar);
                }
                case 5->{
                    
                }
            }//fin switch
        } while (opc != 6);//fin do
    }//fin main
}// fin clase
