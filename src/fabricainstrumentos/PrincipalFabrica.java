
package fabricainstrumentos;

import java.util.ArrayList;


public class PrincipalFabrica {

   
    public static void main(String[] args) {
        
        Fabrica f = new Fabrica();
        cargarFabrica(f);
        
        //f.listarInstrumentos();
        /*ArrayList<Instrumento> lista = f.instrumentoPorTipo(TipoInstrumento.PERCUSION);
        for (Instrumento instrumento : lista) {
            System.out.println(instrumento);
            
        }*/
        
        /*Instrumento borrado = f.borrarInstrumento("kkkk");
        System.out.println("Se borro: " + borrado);
        f.listarInstrumentos();*/
        
        double[] porc = f.porcInstrumentosPorTipo("Sucursal ");
        
        for (int i = 0; i < porc.length; i++) {
            System.out.println(porc[i]);
            
        }
        
        
        
        
    }
    private static void cargarFabrica(Fabrica f){
        Sucursal s1 = new Sucursal("Sucursal A");
        Sucursal s2 = new Sucursal("Sucursal B");
        
        
        s1.agregarInstrumento(new Instrumento("123321",350000,TipoInstrumento.CUERDA));
        s1.agregarInstrumento(new Instrumento("876678",230000,TipoInstrumento.VIENTO));
        s1.agregarInstrumento(new Instrumento("098890",780000,TipoInstrumento.PERCUSION));
        
        s2.agregarInstrumento(new Instrumento("345654",2760000,TipoInstrumento.VIENTO));
        s2.agregarInstrumento(new Instrumento("756567",87000,TipoInstrumento.PERCUSION));
        
        //s1.listarInstrumento();
        //s2.listarInstrumento();
        
        
        
        f.agregarSucursal(s1);
        f.agregarSucursal(s2);
        
        
    
    }
    
}
