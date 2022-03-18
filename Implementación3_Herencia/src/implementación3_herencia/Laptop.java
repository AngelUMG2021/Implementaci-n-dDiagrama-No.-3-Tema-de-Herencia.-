/*
 * Implementación del Diagrama No. 3, Tema de Herencia. 
 * Clase Laptop.
 * Clase Hija o Subclase.
 */
package implementación3_herencia;

/**
 *
 * @author L. A.
 */
public class Laptop extends Computer{//Laptop: Ordenador Portátil.
    
    int númeroSerie;
    
    //Constructor. 
    public Laptop(int númeroSerie, String marca, String modelo, int capacidadMemoria) {
        super(marca, modelo, capacidadMemoria);
        this.númeroSerie = númeroSerie;
    }

    public int getNúmeroSerie() {
        return númeroSerie;
    }

    public void setNúmeroSerie(int númeroSerie) {
        this.númeroSerie = númeroSerie;
    }
     
    @Override
    public String toString() {
        return "Laptop{" + "n\u00fameroSerie=" + númeroSerie + '}';
    }
}
