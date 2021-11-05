package mx.com.gm.peliculas.domain;

// Representa los objetos pelìcula utilizados  
// en la aplicaciòn catàlogo de oelìculas
public class Pelicula {

    private String nombre;
    
    public Pelicula() {
    }

    public Pelicula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Clase Pelìcula: " 
                + "\n nombre: " + nombre;
    }
    
    
    
}
