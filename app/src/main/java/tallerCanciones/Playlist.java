package tallerCanciones;
import java.util.ArrayList;

public class Playlist{
    private String nombre;
    private final ArrayList<Cancion> canciones;

    //constructor nomas para crear una PS vacia ;3
    public Playlist(String nombre){
        this.nombre=nombre;
        this.canciones=new ArrayList<>();
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }

    //metodo para agregar una cancion a la PS
    public void agregarCancion(Cancion cancion){
        canciones.add(cancion);
    }

    //metodo para eliminar una cancion de la PS
    public void eliminarCancion(String titulo){
        if(canciones.isEmpty()){ //checar si esta vacia
            System.out.println("La playlist esta vacia");
            return;
        }
        for(Cancion cancion : canciones){ //for each para recorrer la lista de canciones
            if(cancion.getTitulo().equalsIgnoreCase(titulo)){ //ver si la cancion esta en la PS
                canciones.remove(cancion);
                System.out.println("Cancion eliminada");
                return;
            }
        }
        System.out.println("Cancion no encontrada");
    }

    //metodo para mostrar la cantidad de canciones en la PS
    public int cantidadCanciones(){
        return canciones.size();
    }

    //metodo para buscar una cancion por titulo
    public void buscarCancion(String titulo){
        for(Cancion cancion : canciones){
            if(cancion.getTitulo().equalsIgnoreCase(titulo)){
                System.out.println(cancion);
                return;
            }
        }
        System.out.println("Cancion no encontrada");
    }

    public void mostrarCanciones(){
        for(Cancion cancion : canciones){
            System.out.println(cancion);
        }
    }
    
}