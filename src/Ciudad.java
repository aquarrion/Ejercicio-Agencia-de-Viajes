import java.util.List;

public class Ciudad {
    //atributos
    int idCiudad;
    String nombre;
    Ciudad origen;
    Ciudad destino;
    List<Ciudad> ciudad;

    //metodo constructor
    public Ciudad(String nombre,Ciudad origen, Ciudad destino){
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
    }

}
