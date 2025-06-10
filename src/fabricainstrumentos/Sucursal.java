/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricainstrumentos;

import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class Sucursal {
    private ArrayList<Instrumento> instrumentos;
    private String nombre;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        this.instrumentos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    public void agregarInstrumento(Instrumento ins){
        this.instrumentos.add(ins);
    }
    public Instrumento borrarInstrumento(String ID){
        Instrumento insBorrar = buscarInstrumento(ID);
        this.instrumentos.remove(insBorrar);
        //buscarInstrumentoPorID
        //Si existe,borrarlo.
        
        return insBorrar;
    }
    
    private Instrumento buscarInstrumento(String ID){
        int i = 0;
        Instrumento insEncontrado = null;
        while(i < instrumentos.size() && !this.instrumentos.get(i).getID().equals(ID)){
            i++;
        }
        if (i < instrumentos.size()){
            insEncontrado = this.instrumentos.get(i);
        }
        return insEncontrado;
    
    }
    
    public double[] porcInstrumentosPorTipo(){
        final int CANT_INSTRUMENTOS = TipoInstrumento.values().length;
        double[] porcentajes = new double[CANT_INSTRUMENTOS];
        for (Instrumento instrumento : instrumentos) {
            porcentajes[instrumento.getTipo().ordinal()]++;
        }
        absolutoAPorcentaje(porcentajes);
        return porcentajes;
    }
    
    private void absolutoAPorcentaje(double[] porcentajes){
        for (int i = 0; i < porcentajes.length; i++) {
            porcentajes[i] = (porcentajes[i]*100)/ instrumentos.size();
        }
        
    
    }
    
    

    public void listarInstrumento (){
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento);
            
        }
    }
    
    public ArrayList<Instrumento> instrumentoPorTipo(TipoInstrumento tipo){
        ArrayList <Instrumento> instEncontrados = new ArrayList<>();
        for (Instrumento instrumento : instrumentos) {
            if(instrumento.getTipo() == tipo){
                instEncontrados.add(instrumento);
            }
            
        }
        return instEncontrados;
    }
    
    
    
}
