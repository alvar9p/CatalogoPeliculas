package mx.com.gm.peliculas.negocio;

import mx.com.gm.peliculas.datos.AccesoDatos;

// Contiene las implementaciones de las operaciones
// necesarias de la aplicaciòn CatalogoPeliculas
public class CatalogoPeliculasImpl implements CatalogoPeliculas{

    private AccesoDatos datos;
    
    public CatalogoPeliculasImpl() {
    }

    @Override
    public void agregarPelicula(String nombrePelicula, String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listarPeliculas(String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void buscarPelicula(String nombreArchivo, String buscar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void iniciarArchivo(String nombreArchivo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
