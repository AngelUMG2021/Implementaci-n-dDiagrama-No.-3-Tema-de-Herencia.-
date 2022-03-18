/*
 * Implementación del Diagrama No. 3, Tema de Herencia. 
 * Clase Computer.
 * Clase Padre o Superclase.
 */
package implementación3_herencia;

/**
 *
 * @author L. A.
 */
public class Computer {//Computer: Computadora.
    String marca;
    String modelo;
    int capacidadMemoria;

    public Computer(String marca, String modelo, int capacidadMemoria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadMemoria = capacidadMemoria;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
    
    public int getCapacidadMemoria() {
        return capacidadMemoria;
    }

    @Override
    public String toString() {
        return "Computer{" + "marca=" + marca + ", modelo=" + modelo + ", capacidadMemoria=" + capacidadMemoria + '}';
    }

    
}
