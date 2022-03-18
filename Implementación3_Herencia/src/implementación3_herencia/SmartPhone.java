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
public class SmartPhone extends Computer {//SmartPhone: Teléfono Inteligente.
     int  añoEdición;
    
    //Constructor.   
    public SmartPhone(int añoEdición, String marca, String modelo, int capacidadMemoria) {
        super(marca, modelo, capacidadMemoria);
        this.añoEdición = añoEdición;
    }

    public int getNúmeroEdición() {
        return añoEdición;
    }

    public void setNúmeroEdición(int añoEdición) {
        this.añoEdición = añoEdición;
    }

    @Override
    public String toString() {
        return "SmartPhone{" + "n\u00fameroEdici\u00f3n=" + añoEdición + '}';
    }
}
