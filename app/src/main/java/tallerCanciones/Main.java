package tallerCanciones;
import java.util.Scanner; //importar scanner para poder guardar los datos del usuario

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //objeto scanner para "escanear" vaya
        int op; //variable para guardar la opcion del usuario
        Playlist playlist=new Playlist("Playlist"); //crear PS vacia

        //variables para guardar los datos de la cancion
        String titulo, artista;
        int duracion;

        do { 
            System.out.println("Menu de opciones: ");
            System.out.println("1. nombrar Playlist\n2. Agregar cancion a Playlist\n3. Eliminar cancion de Playlist\n4. mostrar cantidad de canciones de Playlist\n5. buscar cancion por titulo\n6. mostrar canciones\n0. salir");
            op=sc.nextInt(); //guardar opcion del usuario

            switch(op){
                case 1:
                    System.out.println("Ingrese el nombre de la Playlist: ");
                    sc.nextLine(); //limpiar buffer
                    String nombre=sc.nextLine(); //guardar nombre de la PS
                    playlist.setNombre(nombre); //nombrar PS
                    break;
                case 2:
                    System.out.println("Ingrese el titulo de la cancion: ");
                    sc.nextLine(); //limpiar buffer
                    titulo=sc.nextLine(); //guardar titulo de la cancion

                    System.out.println("Ingrese el artista de la cancion: ");
                    artista=sc.nextLine(); //guardar artista de la cancion

                    System.out.println("Ingrese la duracion de la cancion en segundos: ");
                    duracion=sc.nextInt(); //guardar duracion de la cancion

                    Cancion cancion=new Cancion(titulo, artista, duracion); //crear cancion
                    playlist.agregarCancion(cancion); //agregar cancion a la PS
                    break;
                case 3:
                    playlist.mostrarCanciones(); //mostrar canciones de la PS
                    System.out.println("Ingrese el titulo de la cancion a eliminar: ");
                    sc.nextLine(); //limpiar buffer
                    titulo=sc.nextLine(); //guardar titulo de la cancion
                    playlist.eliminarCancion(titulo); //eliminar cancion de la PS
                    break;
                case 4:
                    System.out.println("Cantidad de canciones en la Playlist: " + playlist.cantidadCanciones()); //mostrar cantidad de canciones en la PS
                    break;
                case 5:
                    System.out.println("Ingrese el titulo de la cancion a buscar: ");
                    sc.nextLine(); //limpiar buffer
                    titulo=sc.nextLine(); //guardar titulo de la cancion
                    playlist.buscarCancion(titulo); //buscar cancion en la PS
                    break;
                case 6:
                    playlist.mostrarCanciones(); //mostrar canciones de la PS
                    break;
                case 0:
                    System.out.println(playlist.getNombre() + " tiene " + playlist.cantidadCanciones() + " canciones"); //mostrar cantidad de canciones y el nombre de la playlist al finalizar
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op!=0);
        sc.close(); //cerrar scanner
    }
}