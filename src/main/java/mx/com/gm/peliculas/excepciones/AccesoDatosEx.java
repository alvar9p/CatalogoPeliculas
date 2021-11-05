package mx.com.gm.peliculas.excepciones;

// Nos obliga a procesar la excepciòn
public class AccesoDatosEx extends Exception{
    
    public AccesoDatosEx(String mensaje){
        super(mensaje);
    }
}
