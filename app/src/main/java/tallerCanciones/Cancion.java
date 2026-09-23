package tallerCanciones;

public class Cancion{
    private String titulo;
    private String artista;
    private int duracion; //en segundos :p


    //my little constructor :3
    public Cancion(String titulo, String artista, int duracion){
        this.titulo=titulo;
        this.artista=artista;
        this.duracion=duracion;
    }

    //toString para mostrar la informacion de la cancion :3
    @Override
    public String toString(){
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", duracion=" + duracion +
                '}';
    }

    //hice este getter nomas para usarlo en la PS (por mientras)
    public String getTitulo(){
        return titulo;
    }
}