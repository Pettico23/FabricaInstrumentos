/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricainstrumentos;

/**
 *
 * @author Acer
 */
public class Instrumento {
    private String ID;
    private double precio;
    private TipoInstrumento tipo;

    public Instrumento(String ID, double precio, TipoInstrumento tipo) {
        this.ID = ID;
        this.precio = precio;
        this.tipo = tipo;
    }

    public TipoInstrumento getTipo() {
        return tipo;
    }

    public String getID() {
        return ID;
    }
    
    @Override
    public String toString() {
        return "Instrumento{" + "ID=" + ID + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    
    
    
    
}
