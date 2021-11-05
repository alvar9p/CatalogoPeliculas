package mx.com.gm.peliculas.datos;

import java.util.List;
import mx.com.gm.peliculas.domain.Pelicula;
import mx.com.gm.peliculas.excepciones.AccesoDatosEx;
import mx.com.gm.peliculas.excepciones.EscrituraDatosEx;
import mx.com.gm.peliculas.excepciones.LecturaDatosEx;

// Contiene las operaciones a ejecutar en el archivo
// de peliculas.txt

public interface AccesoDatos {
    public abstract boolean existe(String nombreArchivo) throws AccesoDatosEx;
    
    public abstract List<Pelicula> listar(String nombre) throws LecturaDatosEx;
    
    public abstract void escribir(Pelicula pelicula, String nombreArchivo, boolean anexar) throws EscrituraDatosEx;
    
    public abstract String buscar(String nombreArchivo, String buscar) throws LecturaDatosEx;
    
    public abstract void crear(String nombreArchivo) throws AccesoDatosEx;
    
    public abstract void borrar(String nombreArchivo) throws AccesoDatosEx;
    
}
